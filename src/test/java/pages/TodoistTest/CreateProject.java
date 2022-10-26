package pages.TodoistTest;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class CreateProject {
    public Button newProjectButton = new Button(By.xpath("//button[@class=\"a8af2163 _98cd5c3f _45ffe137 ef4c88db f9408a0e\"]"));
    public TextBox nameField = new TextBox(By.id("edit_project_modal_field_name"));
    public Button submitButton = new Button(By.xpath("//button[text()=\"Add\"]"));
    public Button createdProject = new Button(By.xpath("//ul[contains(@id, \"projects_list\")]/li[last()]"));
}
