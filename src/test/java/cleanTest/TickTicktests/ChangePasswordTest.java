package cleanTest.TickTicktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangePasswordTest extends TestBaseTickTick {
    @Test
    public void ChangePassword() throws InterruptedException {
        String user = getAlphaNumericString(6)+"@gmail.com";
        String password = getAlphaNumericString(6);

        mainPage.signUp.click();
        //Sign Up
        signUp.signUpButton.waitClickable();
        signUp.nickName.setText(k.nickName);
        signUp.emailField.setText(user);
        signUp.pwdField.setText(password);
        signUp.signUpButton.click();
        Assertions.assertFalse(signUp.signUpButton.isControlDisplayed(), "Error: user not registered");

        //Sidebar Menu
        centerTaskSection.skipButton.click();
        sidebarMenu.profileButton.click();
        sidebarMenu.settingsButton.click();
        Assertions.assertTrue(sidebarMenu.profileButton.isControlDisplayed());

        //Change Password
        settingsSection.accAndSecButton.waitClickable();
        settingsSection.accAndSecButton.click();
        settingsSection.changePassword.click();
        settingsSection.currentPwd.setText(password);
        settingsSection.newPwd.setText(k.pwdSet);
        settingsSection.saveNewPwd.click();
        settingsSection.doneButton.click();
        sidebarMenu.profileButton.waitClickable();
        sidebarMenu.profileButton.click();
        Assertions.assertNotEquals(password, k.pwdSet);
        }
}
