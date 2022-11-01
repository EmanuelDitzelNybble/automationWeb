package pages.TickTick;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class CenterTaskSection {
    public Button skipButton = new Button(By.xpath("//span[text()=\"Skip\"]"));
    public Label inboxLabel = new Label(By.id("//button[@id='left-menu-t']"));
}
