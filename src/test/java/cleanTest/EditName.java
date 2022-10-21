package cleanTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todo.ly.SettingsSection;

import java.util.Date;

public class EditName extends TestBaseTodoLy {
    @Test
    public void editName(){
        String newName = "FullNameEdited" + new Date();
        mainPage.loginButton.click();

        loginModal.login("emanuel.ditzel@nybblegroup.com", "sennheiser1991");
        menuSection.settings.click();
        settingsSection.fullName.setText(newName);
        settingsSection.button.click();
        menuSection.settings.click();
        Assertions.assertEquals(newName,settingsSection.fullName.getAttribute("value"), "Name did not change");
    }
}

