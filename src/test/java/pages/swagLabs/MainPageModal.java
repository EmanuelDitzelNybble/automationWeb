package pages.swagLabs;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPageModal {
    public Button dropDownButton = new Button(By.xpath("//select[@class='product_sort_container']"));
    public Button lowToHighOption = new Button(By.xpath("//option[text()='Price (low to high)']"));
    public Button addToCartButton = new Button(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
    public Button shoppingCartButton = new Button(By.xpath("//span[@class='shopping_cart_badge']"));
    public Button lowestProduct = new Button(By.xpath("//div[normalize-space()='Sauce Labs Onesie']"));

}
