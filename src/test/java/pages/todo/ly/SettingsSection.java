package pages.todo.ly;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {
    public TextBox fullName= new TextBox(By.id("FullNameInput"),"");
    public TextBox newPassword = new TextBox(By.id("TextPwNew"),"");
    public TextBox oldPassword = new TextBox(By.id("TextPwOld"),"");

    public Button button = new Button(By.xpath("//span[text()='Ok']"),"");
}

