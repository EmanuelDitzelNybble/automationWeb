package cleanTest.todo.ly;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.todo.ly.LoginModal;
import pages.todo.ly.RegisterSection;
import pages.todo.ly.SettingsSection;
import pages.todoLy.MainPage;
import pages.todo.ly.MenuSection;
import singletonSession.Session;
import utils.GetProperties;

public class TestBaseTodoLy {
    public MainPage mainPage=new MainPage();
    public LoginModal loginModal= new LoginModal();
    public MenuSection menuSection= new MenuSection();

    public RegisterSection registerSection = new RegisterSection();
    public SettingsSection settingsSection = new SettingsSection();
    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }
    @AfterEach
    public void cleanup(){
        attach();
        Session.getInstance().closeBrowser();
    }
    @Attachment(value = "screenshot",type = "image/png")
    private byte[] attach(){
        //todo EJ1
        // tomar captura de pantalla - adjuntarlo en el reporte
        return ((TakesScreenshot) Session.getInstance().getBrowser()).getScreenshotAs(OutputType.BYTES);
    }
}


