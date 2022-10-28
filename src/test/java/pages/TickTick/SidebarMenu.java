package pages.TickTick;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class SidebarMenu {
    public Button calendarViewButton = new Button(By.xpath("//a[@class='block w-[24px] h-[24px] relative calendarIcon_3y13p']//*[name()='svg']"));
    public Button habitButton = new Button(By.xpath("//a[@href='#q/all/habit']//*[name()='svg']"));
    public Button searchButton = new Button(By.xpath("//a[@href='#s']//*[name()='svg']"));


}
