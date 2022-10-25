package cleanTest.todo.ly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class EditName extends TestBaseTodoLy {
    String mail = "emanuel.ditzel@nybblegroup.com";
    String pwd = "sennheiser1991";
    @Test
    public void editName(){
        String newName = "FullNameEdited" + new Date();
        mainPage.loginButton.click();

        loginModal.login(mail, pwd);
        menuSection.settings.click();
        settingsSection.fullName.setText(newName);
        settingsSection.button.click();
        menuSection.settings.click();
        Assertions.assertEquals(newName,settingsSection.fullName.getAttribute("value"), "Error: Name did not change");
    }
}

