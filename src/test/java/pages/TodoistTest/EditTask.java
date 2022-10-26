package pages.TodoistTest;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class EditTask {
        public Button editButton = new Button(By.xpath("//div[@class='markdown_content task_content']"));
        // public Button editProjectButton = new Button(By.xpath("//div[text()='Edit project']"));
        public Button editDueDate = new Button(By.xpath("//span[text()='Save']"));
        public Button editPriority = new Button(By.xpath("//span[normalize-space()='P4']"));
        public Button choosingHighPriority = new Button(By.xpath("//li[@id=\"dropdown-select-12-option-4\"]"));
        public Button editSaveButton = new Button(By.xpath("//span[text()='Save']"));


}
