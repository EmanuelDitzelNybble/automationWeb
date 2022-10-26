package cleanTest.swagLabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class AddProductTest extends TestBaseSwagLabs {
    @Test
    public void addProductToCart() throws InterruptedException {
        String userName = "standard_user";
        String pwd = "secret_sauce";
        String cheapestProduct = "Sauce Labs Onesie";

        // Creating Login
        login.userName.setText(userName);
        login.password.setText(pwd);
        login.loginButton.click();
        Assertions.assertFalse(login.loginButton.isControlDisplayed(), "Error, login failed.");

        //Sorting Items
        mainPage.dropDownButton.waitClickable();
        mainPage.dropDownButton.click();
        mainPage.lowToHighOption.click();
        mainPage.lowestProduct.waitTextToBe("Sauce Labs Onesie");
        Assertions.assertEquals(cheapestProduct, mainPage.lowestProduct.getText(), "Error in the order of products");

        // Adding to Cart
        mainPage.addToCartButton.click();
        mainPage.shoppingCartButton.click();
        Assertions.assertEquals(cheapestProduct, cartSection.firstCartItem.getText(), "error");
    }
}
