package com.nttdata.page;

import org.openqa.selenium.By;

public class ProductPage {

    public static By firstProduct = By.cssSelector("article.product-miniature");
    public static By firstProductPrice = By.cssSelector("article.product-miniature div.product-price-and-shipping span.price");
    public static By addToCartButton = By.cssSelector("button.btn.btn-primary.add-to-cart");
    public static By quantityInput = By.id("quantity_wanted");

    // Popup
    public static By popup = By.id("myModalLabel");
    public static By popupProductName = By.cssSelector("#blockcart-modal .product-name");
    public static By popupProductPrice = By.cssSelector("#blockcart-modal .product-price");
    public static By popupTotalPrice = By.cssSelector("#blockcart-modal .cart-products-count");
    public static By proceedToCheckout = By.cssSelector("a.btn.btn-primary");
}
