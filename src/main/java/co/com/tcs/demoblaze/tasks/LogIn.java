package co.com.tcs.demoblaze.tasks;

import co.com.tcs.demoblaze.userinterfaces.Home;
import co.com.tcs.demoblaze.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String usuario=actor.recall("Usuario");
        actor.attemptsTo(
                Click.on(Home.Log_in),
                Enter.theValue(usuario).into(Home.Nombre_LogIn),
                Enter.theValue(Constantes.Password).into(Home.Contrasena_LogIn),
                Click.on(Home.Boton_Login)
        );
    }
    public static LogIn logIn(){ return instrumented(LogIn.class);}
}
