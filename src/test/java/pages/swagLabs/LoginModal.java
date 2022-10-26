package pages.swagLabs;

import cleanTest.yopmail.TestBaseYopMail;
import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginModal {

    public TextBox userName = new TextBox(By.id("user-name"));

    public TextBox password = new TextBox(By.id("password"));

    public Button loginButton = new Button(By.id("login-button"));
}
