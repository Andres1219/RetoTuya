package co.com.tcs.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {

   public static final Target Producto= Target.the("Celular").
            locatedBy("(//tr[@class=\"success\"])[1]");
}
