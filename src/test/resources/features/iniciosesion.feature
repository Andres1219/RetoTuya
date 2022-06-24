#language: en

 Feature: iniciar sesion en la aplicacion demoblaze
Yo como usuario de la aplicacion demoblaze
necesito iniciar sesion
para acceder a las funcionalidades de la aplicacion

   @Registro
Scenario: Registro exitoso
  Given soy un usuario de DemoBlaze sin credenciales
  When ingreso informacion necesaria para crear usuario
  Then se realiza el registro exitoso

   @Carrito
Scenario: Agregar al carrito
  Given que soy un usuario de DemoBlaze
  When agrego un computador al carrito

  When ingreso para verificar carrito
  Then verifico que se encuentre agregado