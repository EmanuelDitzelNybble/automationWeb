package cleanTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todo.ly.LoginModal;
import pages.todo.ly.SettingsSection;
import pages.todoLy.MainPage;
import pages.todo.ly.MenuSection;
import singletonSession.Session;

public class TestBaseTodoLy {
    public MainPage mainPage=new MainPage();
    public LoginModal loginModal= new LoginModal();
    public MenuSection menuSection= new MenuSection();
    public SettingsSection settingsSection = new SettingsSection();
    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}

