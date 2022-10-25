package cleanTest.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TodoistProject extends TestBaseTodoist {
    @Test
    public void updateAndDeleteProject() throws InterruptedException {
        String email = "ditzelemanuel@gmail.com";
        String pwd = "danger1234";
        String projectName = "Old Project Name" + new Date();
        String newProjectName = "New Project Name" + new Date();

        // --- Login ---
        loginModal.login(email, pwd);
        loginModal.loginButton.click();
        loginModal.inboxButtonDisplayed.waitClickable();
        Assertions.assertTrue(loginModal.inboxButtonDisplayed.isControlDisplayed(), "Error, login failed.");

        // --- Create Project ---
        project.newProjectButton.click();
        project.nameField.setText(projectName);
        project.submitButton.click();
        mainPage.projectButton.waitClickable();
        Assertions.assertTrue(project.createdProject.isControlDisplayed(), "Error, project was not created");

        // --- Edit Project ---
        mainPage.projectButton.click();
        edit.editButton.click();
        edit.editProjectTextBox.setText(newProjectName);
        edit.saveChanges.click();
        mainPage.lastProject.waitClickable();
        // Assertions.assertEquals(newProjectName, projectName, "Error, the project name did not change");

        // --- Delete Project ---
        mainPage.projectButton.click();
        deleteProjectModal.deleteProjectButton.click();
        deleteProjectModal.confirmDeleteButton.waitClickable();
        deleteProjectModal.confirmDeleteButton.click();
        Assertions.assertFalse(mainPage.lastProject.isControlDisplayed(), "Error, the project was not deleted.");
    }
}
