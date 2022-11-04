package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox mail = new TextBox(By.xpath("//div[@class=\"tooltip click\"]/input"),"");
    public Button emailButton = new Button(By.xpath("//button[@class=\"md\"]"),"");
    public Button clearButton = new Button(By.xpath("//div[@id=\"clearbut\"]"),"");
}
