package cleanTest.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.util.Date;

public class CRUDYopMail extends TestBaseYopMail {
        @Test
        public void yopMail() throws InterruptedException {
            String mail = "emanuel.ditzel@yopmail.com";
            String randomText = "Body Text" + new Date();
            String iframeInbox = "ifmail";
            String iframeMessagePanel = "ifinbox";

            // Login
            login.mail.setText(mail);
            login.emailButton.click();
            inboxPanel.newMessageButton.click();
            Session.getInstance().getBrowser().switchTo().frame(iframeInbox);
            Assertions.assertTrue(newMessage.sendButton.isControlDisplayed(), "Error, login failed.");

            // New Message
            newMessage.toTextBox.setText(mail);
            newMessage.subject.setText(randomText);
            newMessage.bodyMessage.setText(randomText);
            newMessage.sendButton.click();


            // Delete Message
            Session.getInstance().getBrowser().switchTo().defaultContent();
            inboxPanel.refreshButton.click();
            Session.getInstance().getBrowser().switchTo().frame(iframeMessagePanel);
            // Thread.sleep(4000);
            inboxPanel.selectMessage.click();
            Session.getInstance().getBrowser().switchTo().defaultContent();
            inboxPanel.deleteButton.click();
            Assertions.assertFalse();
        }
}
