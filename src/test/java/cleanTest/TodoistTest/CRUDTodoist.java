package cleanTest.TodoistTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;

public class CRUDTodoist extends TodoistTestBase {
    @Test
    public void createAndDeleteTask() throws InterruptedException {
        String email = "ditzelemanuel@gmail.com";
        String pwd = "danger1234";
        String projectName = "Old Project Name";
        String randomText = "Task Name";
        // Login
        login.login(email, pwd);
        login.loginButton.click();
        login.inboxButtonDisplayed.waitClickable();

        // Create Project
        project.newProjectButton.click();
        project.nameField.setText(projectName);
        project.submitButton.click();

        // Create Task
        // taskCreation.createTask.waitClickable();
        createTask.addTaskIconButton.click();
        createTask.taskName.addText(randomText);
        createTask.dueDate.waitClickable();
        createTask.dueDate.click();
        createTask.tomorrowChoiceButton.click();
        createTask.setPriority.click();
        createTask.setPriority.isControlDisplayed();
        createTask.lowPriorityChoice.click();
        createTask.createTask.waitClickable();
        createTask.createTask.click();
        Assertions.assertEquals(createTask.lastTask(randomText).getText(), randomText, "Error");

        // Edit Task
        createTask.lastTask(randomText).click();
        String date = edit.editDueDate.getText(); // locator.getAttribute(textContent) o getText()
        Thread.sleep(4000);
        edit.editDueDate.click();
        edit.editDueDateWeekend.click();
        String newDate = edit.editDueDate.getText();
        String priority = edit.editPriority.getText();
        edit.editPriority.click();
        String newPriority = edit.editPriority.getText();
        edit.choosingHighPriority.click();
        Assertions.assertNotEquals(date, newDate);
        Assertions.assertNotEquals(priority, newPriority);

        // Delete Task

        //Assertions.assertFalse(createTask.lastTask(randomText).isControlDisplayed());
    }
}
