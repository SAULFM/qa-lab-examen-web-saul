package com.nttdata.steps;

import com.nttdata.page.ProductPage;
import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductSteps {

    private WebDriver driver;

    public ProductSteps(WebDriver driver){
        this.driver = driver;
    }

    public void goToLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(InventoryPage.signInButton));
        loginBtn.click();
    }

    public void goToCategory(String category) {
        driver.findElement(InventoryPage.subCategory(category)).click();
    }
    public void goToSubCategory(String subcategory) {
        driver.findElement(InventoryPage.category(subcategory)).click();
    }


}
