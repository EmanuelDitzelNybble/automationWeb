package cleanTest.TickTicktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TickTickSignInTest extends TestBaseTickTick {
    @Test
    public void loginTest() throws InterruptedException {

        mainPage.signIn.click();
        signInPage.emailLogin.waitClickable();
        signInPage.emailLogin.setText(k.emailSet);
        signInPage.pwdLogin.setText(k.pwdSet);
        signInPage.signInButton.click();
        Assertions.assertFalse(signInPage.signInButton.isControlDisplayed(), "Login error");
    }
}

