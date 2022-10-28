package pages.TickTick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class CreateHabitModal {
    public TextBox dailyCheckIn = new TextBox(By.xpath("//input[@class=\"flex-auto px-[12px] h-[32px] border-[1px] border-solid border-grey-10 rounded-s outline-none focus:border-primary dark:bg-[transparent]\"]"));
    public Button addReminderButton = new Button(By.xpath("//div[@class='w-[56px] h-[32px] absolute top-0 left-0 cursor-pointer rounded-xs border-[1px] border-solid border-grey-10 hover:border-primary ']//*[name()='svg']"));
    public Button setHour = new Button(By.xpath(""));
    public Button saveButton = new Button(By.xpath("//button[text()=\"Save\"]"));
    public Button frecuencyChoicesButton = new Button(By.xpath("//div[contains(text(),'Daily')]"));
    public Button deselectingSunday = new Button(By.xpath("//ul[@class=\"rc-menu rc-menu-root rc-menu-vertical flex flex-row justify-between\"]/li/div[text()=\"Su\"]"));
    public Button okButton = new Button(By.xpath("//button[normalize-space()='OK']"));




}
