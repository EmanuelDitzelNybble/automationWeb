package cleanTest.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.yopmail.InboxPanel;
import pages.yopmail.K;
import pages.yopmail.LoginModal;
import pages.yopmail.NewMessageSection;
import singletonSession.Session;

public class TestBaseYopMail {

    public LoginModal login = new LoginModal();
    public InboxPanel inboxPanel = new InboxPanel();
    public NewMessageSection newMessage = new NewMessageSection();


    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://yopmail.com/en/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
