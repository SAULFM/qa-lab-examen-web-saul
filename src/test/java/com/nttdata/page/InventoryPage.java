package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("img.logo");
    public static By signInButton = By.xpath("//*[contains(@href,'iniciar-sesion')]");


    public static By category(String c) {
        return By.xpath("//*[contains(text(),'" + c + "')]");
    }
    public static By subCategory(String sc) {
        return By.xpath("//*[contains(text(),'" + sc + "')]");
    }
    public static By userName = By.cssSelector("span.hidden-sm-down");
    public static By itemsCards = By.cssSelector("article.product-miniature");
}
