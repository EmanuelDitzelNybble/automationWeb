package pages.TickTick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class CenterTaskSection {
    public TextBox addTask = new TextBox(By.xpath("//pre[@role='presentation']"));
    public Button calendarIconButton = new Button(By.xpath("//div[@class='bg absolute rounded-[2px] opacity-0 z-0 inset-0 group-hover:opacity-100 bg-grey-5 dark:bg-white-10']"));
    public Button dropDownButton = new Button(By.xpath("//a[@class='w-[24px] h-[24px] flex items-center justify-center']//div[@class='relative bgIconWrapper_aJONI']//*[name()='svg']"));
    //a[@class='w-[24px] h-[24px] flex items-center justify-center']//div[@class='relative bgIconWrapper_aJONI']//*[name()='svg']
    //a[@class='w-[24px] h-[24px] flex items-center justify-center']//div[@class='relative bgIconWrapper_aJONI']//*[name()='svg']

}
