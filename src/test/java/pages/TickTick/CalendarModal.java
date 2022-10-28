package pages.TickTick;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class CalendarModal {
    public Button optionButton = new Button(By.xpath("//a[contains(@title,'more')]//div[contains(@class,'relative bgIconWrapper_aJONI')]//*[name()='svg']"));
    public Button deleteHabitButton = new Button(By.xpath("//span[text()=\"Delete\"]"));
    public Button deleteAlertButton = new Button(By.xpath("//div[@class=\"popup-footer\"]/button[text()=\"Delete\"]"));
}
