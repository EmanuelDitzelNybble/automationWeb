package cleanTest.TickTicktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DueDateTest extends TestBaseTickTick {
    @Test
    public void settingDueDate() throws InterruptedException {
        String user = getAlphaNumericString(6)+"@gmail.com";

        mainPage.signUp.click();
        //Sign Up
        signUp.signUpButton.waitClickable();
        signUp.nickName.setText(k.nickName);
        signUp.emailField.setText(user);
        signUp.pwdField.setText(k.pwdSet);
        signUp.signUpButton.click();
        Assertions.assertFalse(signUp.signUpButton.isControlDisplayed(), "Error: user not registered");

        // Changing Due Date
        centerTaskSection.skipButton.waitClickable();
        centerTaskSection.skipButton.click();
        taskPage.TaskToEdit.click();
        taskPage.dueDateButton.click();
        taskPage.repeatTaskButton.click();
        taskPage.weeklyButton.click();
        taskPage.okButton.click();
        Assertions.assertFalse(taskPage.repeatTaskButton.isControlDisplayed());
    }
}
