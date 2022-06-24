package co.com.tcs.demoblaze.stepdefinitions;

import co.com.tcs.demoblaze.questions.VerificacionProducto;
import co.com.tcs.demoblaze.questions.VerificacionUsuario;
import co.com.tcs.demoblaze.tasks.LogIn;
import co.com.tcs.demoblaze.tasks.LogInCart;
import co.com.tcs.demoblaze.tasks.LogInRuta;
import co.com.tcs.demoblaze.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;
    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("carlos");
    }
    @Given("^soy un usuario de DemoBlaze sin credenciales$")
    public void soyUnUsuarioDeDemoBlazeSinCredenciales(){
            theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }

    @When("^ingreso informacion necesaria para crear usuario$")
    public void ingresoInformacionNecesariaParaCrearUsuario() {
        theActorInTheSpotlight().attemptsTo(Registro.registro());
        theActorInTheSpotlight().attemptsTo(LogIn.logIn());
    }

    @Then("^se realiza el registro exitoso$")
    public void seRealizaElRegistroExitoso() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionUsuario.verificacionUsuario(), Matchers.is(true)));
    }

    @Given("^que soy un usuario de DemoBlaze$")
    public void queSoyUnUsuarioDeDemoBlaze() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }

    @When("^agrego un computador al carrito$")
    public void agregoUnComputadorAlCarrito() {
        theActorInTheSpotlight().attemptsTo(LogInCart.logInCart());
    }

    @When("^ingreso para verificar carrito$")
    public void ingresoParaVerificarCarrito() {
        theActorInTheSpotlight().attemptsTo(LogInRuta.logInRuta());
    }

    @Then("^verifico que se encuentre agregado$")
    public void verificoQueSeEncuentreAgregado() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionProducto.verificacionProducto(), Matchers.is(true)));
    }
}
