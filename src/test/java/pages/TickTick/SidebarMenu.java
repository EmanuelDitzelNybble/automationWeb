package pages.TickTick;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class SidebarMenu {
    public Button habitButton = new Button(By.xpath("//a[@href='#q/all/habit']//*[name()='svg']"));
    public Button profileButton = new Button(By.xpath("//div[@id=\"tl-bar-user\"]"));
    public Button settingsButton = new Button(By.xpath("//span[text()=\"Settings\"]"));
}
