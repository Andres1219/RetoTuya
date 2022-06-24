package co.com.tcs.demoblaze.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home extends PageObject {
    public static final Target Sign_up= Target.the("SIGN UP").
            locatedBy("//a[@id=\"signin2\"]");
    public static final Target Nombre_registro= Target.the("Name registro").
            located(By.id("sign-username"));
    public static final Target Contrasena_registro= Target.the("Contrasena registro").
            located(By.id("sign-password"));
    public static final Target Boton_Registro= Target.the("Registro completado").
            locatedBy("//button[@onclick=\"register()\"]");
    public static final Target Log_in= Target.the("LOG IN").
            locatedBy("//a[@id=\"login2\"]");

    public static final Target Nombre_LogIn= Target.the("name login").
            locatedBy("//input[@id=\"loginusername\"]");

    public static final Target Contrasena_LogIn= Target.the("password login").
            locatedBy("//input[@id=\"loginpassword\"]");

    public static final Target Boton_Login= Target.the("login completado").
            locatedBy("//button[@onclick=\"logIn()\"]");
    public static final Target Usuario_ingresado= Target.the("Welcome").
            locatedBy("//a[@id=\"nameofuser\"]");
    public static final Target Cart= Target.the("Carrito").
            locatedBy("//a[@id=\"cartur\"]");

    public static final Target Celular= Target.the("Celular").
            locatedBy("(//a[@href=\"prod.html?idp_=1\"])[2]");
    public static final Target Boton_agregar= Target.the("boton de agregar").
            locatedBy("//a[@onclick=\"addToCart(1)\"]");
}
// <a href="prod.html?idp_=15" class="hrefch" xpath="1">

// <a href="prod.html?idp_=1" class="hrefch" xpath="1">