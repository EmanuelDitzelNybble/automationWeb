package cleanTest.TodoistTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.TodoistTest.*;
import singletonSession.Session;

import java.util.Date;

public class TodoistTestBase {

        public LoginModal login = new LoginModal();
        public CreateProject project = new CreateProject();
        public CreateTask taskCreation = new CreateTask();

        public EditTask edit = new EditTask();

        public DeleteTask delete = new DeleteTask();

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://todoist.com/auth/login");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}

