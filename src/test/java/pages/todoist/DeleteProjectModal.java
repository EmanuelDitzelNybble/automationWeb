package pages.todoist;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class DeleteProjectModal {
    public Button deleteProjectButton = new Button(By.xpath("//div[text()=\"Delete project\"]"));
    public Button confirmDeleteButton = new Button(By.xpath("//span[text()=\"Delete\"]"));
}
