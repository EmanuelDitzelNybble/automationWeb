package cleanTest.todo.ly;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBaseTodoLy {
    @Test
    @DisplayName("Verify login is successfully")
    @Description("This test case is to verify the login using valid credentials with any role")
    @Owner("Emanuel")
    @Link("www.jira.com/doc027")
    @Epic("Login")
    @Feature("Authentication")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Story Login")
    public void verifyLoginSuccessfully(){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText("selenium@selenium2022.com");
        loginModal.passwordTextBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR login was not successfully");

    }
}

// allure serve build/allure-results