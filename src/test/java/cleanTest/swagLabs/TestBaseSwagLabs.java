package cleanTest.swagLabs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.swagLabs.CartModal;
import pages.swagLabs.LoginModal;
import pages.swagLabs.MainPageModal;
import singletonSession.Session;

public class TestBaseSwagLabs {

    public LoginModal login = new LoginModal();
    public MainPageModal mainPage = new MainPageModal();
    public CartModal cartSection = new CartModal();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://www.saucedemo.com");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
