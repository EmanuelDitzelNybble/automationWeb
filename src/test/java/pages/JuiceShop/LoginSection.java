package pages.JuiceShop;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public Button newCostumerLink = new Button(By.xpath("//a[@class='primary-link']"));
    public TextBox emailLogin = new TextBox(By.xpath("//input[@id='email']"));
    public TextBox pwdLogin = new TextBox(By.xpath("//input[@id='password']"));
    public Label label = new Label(By.xpath("//h1[text()=\"Login\"]"));
    public TextBox loginButtonSection = new TextBox(By.xpath("//button[@id='loginButton']"));



}
