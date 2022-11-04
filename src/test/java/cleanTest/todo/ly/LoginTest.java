package cleanTest.todo.ly;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import utils.GetProperties;

@Tag("Sanity")
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
    @Attachment
    @Tag("SmokeTest")
    public void verifyLoginSuccessfully(){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText(GetProperties.getInstance().getUser());
        loginModal.passwordTextBox.setText(GetProperties.getInstance().getPwd());
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR login was not successfully");
    }
}

// allure serve build/allure-results