package cleanTest.TickTicktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeDateAndTimeFormatTest extends TestBaseTickTick {
    @Test
    public void ChangeDateAndTimeFormat() throws InterruptedException {
        String user = getAlphaNumericString(6)+"@gmail.com";

        //Sign Up
        mainPage.signUp.click();
        signUp.signUpButton.waitClickable();
        signUp.nickName.setText(k.nickName);
        signUp.emailField.setText(user);
        signUp.pwdField.setText(k.pwdSet);
        signUp.signUpButton.click();
        Assertions.assertFalse(signUp.signUpButton.isControlDisplayed(), "Error: user not registered");

        // Settings
        //Sidebar Menu
        centerTaskSection.skipButton.waitClickable();
        centerTaskSection.skipButton.click();
        sidebarMenu.profileButton.click();
        sidebarMenu.settingsButton.click();
        Assertions.assertTrue(sidebarMenu.profileButton.isControlDisplayed());

        // Changing Date And Time
        preferenceSection.timeFormat.click();
        preferenceSection.halfDayFormat.waitClickable();
        preferenceSection.halfDayFormat.click();
        preferenceSection.startWithButton.click();
        preferenceSection.startWithMonday.waitClickable();
        preferenceSection.startWithMonday.click();
        settingsSection.doneButton.click();
        Assertions.assertTrue(sidebarMenu.profileButton.isControlDisplayed()); // change
    }
}
