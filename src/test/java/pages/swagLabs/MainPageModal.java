package pages.swagLabs;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPageModal {
    public Button dropDownButton = new Button(By.xpath("//select[@class='product_sort_container']"), "[Drop-down] button in Main Page");
    public Button lowToHighOption = new Button(By.xpath("//option[text()='Price (low to high)']"), "[Low to High] option in Main Page");
    public Button addToCartButton = new Button(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"), "[Add To Cart] button in Main Page");
    public Button shoppingCartButton = new Button(By.xpath("//span[@class='shopping_cart_badge']"), "[Shopping Cart] button in Main Page");
    public Button lowestProduct = new Button(By.xpath("//div[normalize-space()='Sauce Labs Onesie']"), "[Lowest Product] option in Main Page");

}
