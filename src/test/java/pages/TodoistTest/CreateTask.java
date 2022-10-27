package pages.TodoistTest;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class CreateTask {
    public Button addTaskIconButton = new Button(By.xpath("//button[text()='Add task']"));
    public TextBox taskName = new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
    public Button dueDate = new Button(By.xpath("//span[text()='Due date']"));
    public Button tomorrowChoiceButton = new Button(By.xpath("//div[text()='Tomorrow']"));
    public Button setPriority = new Button(By.xpath("//button[@aria-label='Set the priority']"));
    //span[@data-action-hint='task-actions-priority-picker']//*[name()='svg'] // probar por si no anda setpriority.
    public Button createTask = new Button(By.xpath("//span[text()='Add task']"));
    public Button highPriorityChoice = new Button(By.xpath("//span[text()='Priority 1']"));
    public Button lowPriorityChoice = new Button(By.xpath("//span[text()='Priority 4']"));

    public Button lastTask(String name)
    {
        Button lastTask = new Button(By.xpath("//ul//li[last()]//li[@aria-selected=\"false\"][last()]//div[@class='markdown_content task_content' and text()='"+name+"']"));
        return lastTask;
    }
}
