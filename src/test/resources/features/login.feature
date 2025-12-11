#language: es
@testfeature
Característica: Login
  Como usuario de la página mystore
  Quiero, acceder al contenido tras iniciar sesión
  Para ver todos los items de la tienda

  @test
  Escenario: Iniciar sesión - Acceso válido
    Dado que me encuentro en la página de login de My Store
    Cuando inicio sesión con las credenciales de correo: "<correo>" y contraseña "<password>"
    Entonces valido que mi nombre de usuario esté visible

    Ejemplos:
      |correo|password|
      |sacfm.123@gmail.com|s@cfm.123|


