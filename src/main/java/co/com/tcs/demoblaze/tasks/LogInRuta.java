package co.com.tcs.demoblaze.tasks;

import co.com.tcs.demoblaze.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogInRuta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.Cart)
        );
    }
    public static LogInRuta logInRuta(){ return instrumented(LogInRuta.class);}
}
