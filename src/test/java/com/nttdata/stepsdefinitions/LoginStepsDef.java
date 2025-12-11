package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class LoginStepsDef {

    private WebDriver driver;


    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("que me encuentro en la página de login de My Store")
    public void que_me_encuentro_en_la_página_de_login_de_mystore() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion");
        screenShot();
    }
    @Cuando("inicio sesión con las credenciales de correo: {string} y contraseña {string}")
    public void inicio_sesión_con_las_credenciales_correo_y_contraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);

        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }
    @Entonces("valido que mi nombre de usuario esté visible")
    public void valido_nombre_usuario_visible() {

        InventorySteps inventory = new InventorySteps(driver);

        String username = inventory.getUserName();

        Assertions.assertFalse(username.isEmpty(),"El nombre de usuario no se está mostrando en pantalla");

        System.out.println("Usuario visible: " + username);
        screenShot();
    }


}
