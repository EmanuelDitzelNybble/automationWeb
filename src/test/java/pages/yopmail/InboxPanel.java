package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.CheckBox;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class InboxPanel {
        public Button newMessageButton = new Button(By.id("newmail"), "");
        public Button refreshButton = new Button(By.id("refresh"), "");
        public CheckBox selectMessage = new CheckBox(By.xpath("//input[@type=\"checkbox\"]"), "");
        public Button deleteButton = new Button(By.id("delsel"), "");
}
