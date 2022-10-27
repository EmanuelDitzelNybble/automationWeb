package cleanTest.JuiceShop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class JuiceShopTest extends TestBaseJuiceShop {
    @Test
    public void registerAndLogout() throws InterruptedException {
        String email = "ditzelemanuel"+ new Date().getTime() +"@email.com";
        String pwd = "danger1234";
        String answer = "Olga";

        welcomePopUp.dismissButton.click();

        //navbar Section
        navBarSection.accountButton.click();
        navBarSection.loginButton.waitClickable();
        navBarSection.loginButton.click();

        //Login to Register
        login.newCostumerLink.waitClickable();
        login.newCostumerLink.click();

        //Register
        registerSection.emailAddress.addText(email);
        registerSection.passwordRegistration.addText(pwd);
        registerSection.repeatPassword.addText(pwd);
        registerSection.securityQuestion.click();
        registerSection.motherNameOption.waitClickable();
        registerSection.motherNameOption.click();
        registerSection.answer.addText(answer);
        registerSection.registerButton.waitClickable();
        registerSection.registerButton.click();
        Assertions.assertTrue(login.label.isControlDisplayed(), "REGISTRATION ERROR");
        //Login
        login.emailLogin.addText(email);
        login.pwdLogin.addText(pwd);
        login.loginButtonSection.waitClickable();
        login.loginButtonSection.click();
        Assertions.assertTrue(navBarSection.openSideButton.isControlDisplayed(), "LOGIN ERROR");
        //Logout
        navBarSection.accountButton.click();
        navBarSection.logoutButton.click();
        Assertions.assertFalse(navBarSection.cartBasket.isControlDisplayed(), "LOGOUT ERROR");
    }
}
// registro, login, logout -> Assertions to do