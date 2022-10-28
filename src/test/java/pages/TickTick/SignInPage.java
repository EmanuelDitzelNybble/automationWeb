package pages.TickTick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class SignInPage {
    public TextBox emailLogin = new TextBox(By.id("emailOrPhone"));
    public TextBox pwdLogin = new TextBox(By.id("password"));
    public Button signInButton = new Button(By.xpath("//button[@class='button__3eXSs ']"));
}
