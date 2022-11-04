package pages.TickTick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class SignUpPage {
    public TextBox nickName = new TextBox(By.id("name"),"");
    public TextBox emailField = new TextBox(By.xpath("//input[@placeholder='Email']"),"");
    public TextBox pwdField = new TextBox(By.id("password"),"");
    public Button signUpButton = new Button(By.xpath("//button[@class='button__3eXSs ']"),"");

}
