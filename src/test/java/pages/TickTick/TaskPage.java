package pages.TickTick;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class TaskPage {
    public Button TaskToEdit = new Button(By.xpath("//span[text()=\"Welcome to TickTick\"]"));
    public Button dueDateButton = new Button(By.xpath("//span[@class=\"inline-flex overflow-hidden group cursor-pointer\"]"));
    public Button okButton = new Button(By.xpath("//button[text()=\"OK\"]"));
    public Button repeatTaskButton = new Button(By.xpath("//div[@class=\"multi-select-toggle px-[12px] group relative\"]"));
    public Button weeklyButton = new Button(By.xpath("//span[text()=\"Weekly\"]"));
}
