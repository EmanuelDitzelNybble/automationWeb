package pages.TodoistTest;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class EditTask {
        //public Button editButton = new Button(By.xpath("//div[@class='markdown_content task_content']"));
        public Button editButton1 = new Button(By.xpath("//button[@data-testid=\"more_menu\"]"));
        //
        // public Button editProjectButton = new Button(By.xpath("//div[text()='Edit project']"));
        public Button editDueDate = new Button(By.xpath("//div[@aria-label=\"Due date\"]//span[@class=\"bbdb467b f9408a0e d745aa1e _473810b4 _8c75067a\"]"));
        public Button editDueDate1 = new Button(By.xpath("//span[@class='bbdb467b f9408a0e d745aa1e _473810b4 _8c75067a'][normalize-space()='Tomorrow']"));

        public Button editDueDateWeekend = new Button(By.xpath("//div[normalize-space()='This weekend']"));
        public Button editPriority = new Button(By.xpath("//div[@aria-label=\"Priority\"]//span"));
        public Button choosingHighPriority = new Button(By.xpath("//li[@id=\"dropdown-select-12-option-4\"]"));
        public Button editSaveButton = new Button(By.xpath("//span[text()='Save']"));

}
