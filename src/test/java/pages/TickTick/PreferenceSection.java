package pages.TickTick;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class PreferenceSection {
    public Button timeFormat = new Button(By.xpath("//div[contains(text(),'24 Hour')]"),"");
    public Button startWithButton = new Button(By.xpath("//div[contains(text(),'Sunday')]"),"");
    public Button halfDayFormat = new Button(By.xpath("//span[text()=\"12 Hour\"]"),"");
    public Button startWithMonday = new Button(By.xpath("//span[text()=\"Monday\"]"),"");
}
