package cleanTest.TodoistTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        //Create Task
        // taskCreation.createTask.waitClickable();
        taskCreation.addTaskIconButton.click();
        taskCreation.taskName.addText(randomText);
        String name = taskCreation.taskName.getAttribute("value");
        taskCreation.dueDate.waitClickable();
        taskCreation.dueDate.click();
        taskCreation.tomorrowChoiceButton.click();
        taskCreation.setPriority.click();
        taskCreation.setPriority.isControlDisplayed();
        taskCreation.lowPriorityChoice.click();
        taskCreation.createTask.waitClickable();
        taskCreation.createTask.click();
        System.out.println("Creado");


        //Task Edition
        //edit.editButton.click();
        Thread.sleep(4000);
    }
}
