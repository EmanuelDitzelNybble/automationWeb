package pages.TickTick;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class HabitSection {
    public Button plusIcon = new Button(By.xpath("//span[@class='inline-block w-[18px] h-[18px] mr-[8px] cursor-pointer']//div[@class='relative bgIconWrapper_aJONI']//*[name()='svg']"));
    // public Button clickHabit = new Button(By.xpath("//p[@class=\"name\"]"));

    public Button clickHabit(String habitName){
        Button selectHabit = new Button(By.xpath("\"//p[@class="+ habitName +"]\""));
        return selectHabit;
    }
}
