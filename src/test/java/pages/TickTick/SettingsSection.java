package pages.TickTick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {
    public Button doneButton = new Button(By.xpath("//button[text()=\"Done\"]"));
    public Button accAndSecButton = new Button(By.xpath("//span[text()=\"Account and Security\"]"));
    public Button changePassword = new Button(By.xpath("//*[text()=\"Change Password\"]"));
    public TextBox currentPwd = new TextBox(By.xpath("//div[@style=\"display: block;\"]/span/input[@placeholder=\"Current Password\"]"));
    public TextBox newPwd = new TextBox(By.xpath("//div[@style=\"display: block;\"]/span[last()]/input[@placeholder=\"New password\"]"));
    public Button saveNewPwd = new Button(By.xpath("//button[text()=\"Save\"]"));

}
