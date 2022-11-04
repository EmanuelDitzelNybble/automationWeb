package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class NewMessageSection {
    public TextBox toTextBox = new TextBox(By.id("msgto"),"");
    public TextBox subject = new TextBox(By.id("msgsubject"),"");
    public TextBox bodyMessage = new TextBox(By.id("msgbody"),"");
    public Button sendButton = new Button(By.xpath("//span[text()=\"Send the message\"]"),"");

    public Button messageCreated = new Button(By.xpath("//span[@class=\"lmf\"]"),"");
}
