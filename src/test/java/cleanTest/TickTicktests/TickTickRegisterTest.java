package cleanTest.TickTicktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class TickTickRegisterTest extends TestBaseTickTick {
    @Test
    public void registerTest() throws InterruptedException {
        mainPage.signUp.click();
        //Sign Up
        signUp.signUpButton.waitClickable();
        signUp.nickName.setText(k.nickName);
        signUp.emailField.setText(k.email);
        signUp.pwdField.setText(k.pwd);
        signUp.signUpButton.click();
        Assertions.assertFalse(signUp.signUpButton.isControlDisplayed(), "Error: user not registered");
    }
}
