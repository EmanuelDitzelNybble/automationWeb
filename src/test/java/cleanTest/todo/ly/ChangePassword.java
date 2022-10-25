package cleanTest.todo.ly;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class ChangePassword extends TestBaseTodoLy {
    @Test
    public void userRegister() throws InterruptedException {
        String userName = "Emanuel";
        String userEmail = String.valueOf(new Date()) +"@gmail.com";
        String password = "19910816";
        String newPassword = "19910822";

        mainPage.registerButton.click();
        registerSection.register(userName, userEmail, password);
        menuSection.settings.click();
        settingsSection.newPassword.setText(newPassword);
        settingsSection.oldPassword.setText(password);
        settingsSection.button.click();
        menuSection.logoutButton.click();
        mainPage.loginButton.waitClickable();
        mainPage.loginButton.click();
        loginModal.login(userName, newPassword);
    }
}
