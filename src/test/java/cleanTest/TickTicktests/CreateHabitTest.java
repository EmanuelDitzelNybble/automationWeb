package cleanTest.TickTicktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateHabitTest extends TestBaseTickTick{
    @Test
    public void createAndDeleteHabit() throws InterruptedException{

        //Sign In
        mainPage.signIn.click();
        signInPage.emailLogin.waitClickable();
        signInPage.emailLogin.setText(k.emailSet);
        signInPage.pwdLogin.setText(k.pwdSet);
        signInPage.signInButton.click();
        Assertions.assertFalse(signInPage.signInButton.isControlDisplayed(), "Login error");

        sidebarMenu.habitButton.waitClickable();
        sidebarMenu.habitButton.click();
        // Creating Habit
        habitSection.plusIcon.click();
        Assertions.assertTrue(createHabitModal.dailyCheckIn.isControlDisplayed());

        createHabitModal.dailyCheckIn.waitClickable();
        createHabitModal.dailyCheckIn.setText(k.nickName);
        createHabitModal.frecuencyChoicesButton.click();
        createHabitModal.deselectingSunday.click();
        createHabitModal.okButton.click();
        createHabitModal.saveButton.click();
        Assertions.assertFalse(createHabitModal.dailyCheckIn.isControlDisplayed());
        //Delete Habit
        Thread.sleep(4000);
        habitSection.clickHabit(k.nickName).click();
        Thread.sleep(4000);
    }
}
