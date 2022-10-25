package pages.todoist;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class EditProject {
    public TextBox editProjectTextBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button saveChanges = new Button(By.xpath("//button[ text()=\"Save\"]"));
    public Button editButton = new Button(By.xpath("//div[text()=\"Edit project\"]"));
}
