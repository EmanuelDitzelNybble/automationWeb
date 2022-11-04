package pages.PhpTravels;

import controlSelenium.Button;
import controlSelenium.CheckBox;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox inputEmail = new TextBox(By.id("inputEmail"),"[Email Address] textbox in login modal");
    public TextBox inputPassword = new TextBox(By.id("inputPassword"),"[Password] textbox in login modal");
    public CheckBox loginCaptcha = new CheckBox(By.xpath("//div[@class='recaptcha-checkbox-border']"), "[Captcha] checkbox in login modal");
    public Button loginButton = new Button(By.id("login"), "[Login] button in login modal");
}
