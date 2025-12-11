package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.ProductSteps;
import io.cucumber.java.es.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class ProductStepsDef {

    private WebDriver driver;
    private ProductSteps productSteps;

    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_pagina_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        productSteps = new ProductSteps(driver);
        screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void me_logueo_con_mi_usuario_y_clave(String user, String pass) {
        // Hacer click a iniciar sesión
        productSteps.goToLogin();

        LoginSteps login = new LoginSteps(driver);
        login.typeUser(user);
        login.typePassword(pass);
        login.login();
        screenShot();
    }

    @Cuando("navego a la categoría {string} y subcategoria {string}")
    public void navego_categoria_subcategoria(String categoria, String subcategoria) {
        // se navega a la categoría
        screenShot();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agrego_unidades(int cantidad) {
        // Se agrega unidades del producto
        screenShot();
    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void valido_popup_confirmacion() {
        // Se valida confirmación de producto agregado
        screenShot();
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void valido_calculo_popup() {
        // Se monto total
        screenShot();
    }

    @Cuando("finalizo la compra")
    public void finalizo_compra() {
        // Se finaliza compra
        screenShot();
    }

    @Entonces("valido el titulo de la pagina del carrito")
    public void valido_titulo_carrito() {
        // Se valida titulo de la pagian del carrito
        screenShot();
    }

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvo_validar_calculo() {
        // Se valida calculo de precios
        screenShot();
    }
}
