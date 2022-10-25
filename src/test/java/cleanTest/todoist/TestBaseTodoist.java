package cleanTest.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoist.*;
import singletonSession.Session;

public class TestBaseTodoist {
        public MainPage mainPage = new MainPage();
        public CreateProject project = new CreateProject();
        public LoginTodoist loginModal= new LoginTodoist();
        public DeleteProjectModal deleteProjectModal = new DeleteProjectModal();
        public EditProject edit = new EditProject();

        @BeforeEach
        public void setup(){
            // todo create properties file
            Session.getInstance().getBrowser().get("https://todoist.com/auth/login");
        }

        @AfterEach
        public void cleanup(){
            Session.getInstance().closeBrowser();
        }
    }
