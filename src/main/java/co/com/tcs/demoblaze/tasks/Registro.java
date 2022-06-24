package co.com.tcs.demoblaze.tasks;

import co.com.tcs.demoblaze.userinterfaces.Home;
import co.com.tcs.demoblaze.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int valor= new Random().nextInt(10000+1)+1;
        actor.attemptsTo(
                Click.on(Home.Sign_up),
                Enter.theValue(Constantes.Name+valor).into(Home.Nombre_registro),
                Enter.theValue(Constantes.Password).into(Home.Contrasena_registro),
                Click.on(Home.Boton_Registro)
        );
        actor.remember("Usuario", Constantes.Name+valor);
    }
    public static Registro registro(){ return instrumented(Registro.class);}
}
