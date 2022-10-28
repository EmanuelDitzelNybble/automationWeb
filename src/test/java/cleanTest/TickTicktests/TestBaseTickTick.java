package cleanTest.TickTicktests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.TickTick.*;
import singletonSession.Session;

public class TestBaseTickTick {

    public MainPage mainPage = new MainPage();
    public SignUpPage signUp = new SignUpPage();
    public K k = new K();
    public SidebarMenu sidebarMenu = new SidebarMenu();
    public SignInPage signInPage = new SignInPage();
    public CenterTaskSection centerTaskSection = new CenterTaskSection();
    public CreateHabitModal createHabitModal = new CreateHabitModal();
    public HabitSection habitSection = new HabitSection();

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://ticktick.com/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
