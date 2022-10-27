package cleanTest.JuiceShop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.JuiceShop.LoginSection;
import pages.JuiceShop.NavBarSection;
import pages.JuiceShop.RegisterSection;
import pages.JuiceShop.WelcomePopUp;
import singletonSession.Session;

public class TestBaseJuiceShop {

    public LoginSection login = new LoginSection();
    public NavBarSection navBarSection = new NavBarSection();
    public RegisterSection registerSection = new RegisterSection();

    public WelcomePopUp welcomePopUp = new WelcomePopUp();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("http://localhost:3000/#/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
