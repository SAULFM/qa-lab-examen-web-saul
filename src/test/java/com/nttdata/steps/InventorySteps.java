package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    // Obtiene el valor del título
    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getAttribute("alt");
    }
    // Obtiene el valor de la categoría
    public String getCategory(String category) {
       return this.driver.findElement(InventoryPage.category(category)).getText();
    }
    public String getUserName() {
        return driver.findElement(InventoryPage.userName).getText();
    }

}
