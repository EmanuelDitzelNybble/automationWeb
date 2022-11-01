package cleanTest.TickTicktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangePasswordTest extends TestBaseTickTick {
    @Test
    public void ChangePassword() throws InterruptedException {
        String user = getAlphaNumericString(6)+"@gmail.com";
        // Verify if the user can change his password
        //Sign Up
        // 1- Click on the [Sign Up for free] button.
        mainPage.signUp.click();
        signUp.signUpButton.waitClickable();
        // Set [Nickname] textbox with valid data. Example: 'Ema'
        signUp.nickName.setText(k.nickName);
        // Set [Email] textbox with valid data. Example: 'ditzelemanuel@gmail.com'
        signUp.emailField.setText(user);
        // Set [Password] textbox with valid data. Example: 'danger1234'
        signUp.pwdField.setText(k.pwd);
        // Click [Sign Up] button.
        signUp.signUpButton.click();

        // Expected Result: The user should have logged in successfully.
        //Assertions.assertTrue(centerTaskSection.inboxLabel.isControlDisplayed(), "Error: user not registered");
        centerTaskSection.skipButton.waitClickable();
        centerTaskSection.skipButton.click();
        //Sidebar Menu
        // Click on [Skip] button in Welcome Pop-up

        // In the left panel, click on the [Profile] button
        sidebarMenu.profileButton.click();
        // In the drop-down menu, click on the [Settings] option.
        sidebarMenu.settingsButton.click();
        // Expected Result: The user should be redirected to the Settings section.
        Assertions.assertTrue(sidebarMenu.profileButton.isControlDisplayed());

        //Change Password
        settingsSection.accAndSecButton.waitClickable();
        // Click on [Account and Security] button.
        settingsSection.accAndSecButton.click();
        // Click on [Change Password] button.
        settingsSection.changePassword.click();
        // Set [Current Password] textbox with current password. Current pwd: 'danger1234'
        settingsSection.currentPwd.setText(k.pwd);
        // Set [New Password] textbox with new password. Current pwd: sennheiser1234
        settingsSection.newPwd.setText(k.pwdSet);
        // Click [Save] button.
        settingsSection.saveNewPwd.click();
        // Click [Done] button, located on the upper right
        settingsSection.doneButton.click();
        sidebarMenu.profileButton.waitClickable();
        // Click on [Profile] button, located on the upper left
        sidebarMenu.profileButton.click();
        // Expected result: The user was able to change his password
        Assertions.assertNotEquals(k.pwd, k.pwdSet);
        /*
        mainPage.signIn.click();
        signInPage.emailLogin.waitClickable();
        signInPage.emailLogin.setText(user);
        signInPage.pwdLogin.setText(k.pwdSet);
        signInPage.signInButton.click();
        Assertions.assertFalse(signInPage.signInButton.isControlDisplayed(), "Login error");
         */
    }

}
