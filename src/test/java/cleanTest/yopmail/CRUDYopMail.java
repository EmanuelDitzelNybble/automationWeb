package cleanTest.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.sql.Driver;
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
            Session.getInstance().switchIFrame(iframeInbox);
            Assertions.assertTrue(newMessage.sendButton.isControlDisplayed(), "Error, login failed.");
            Assertions.assertFalse(login.clearButton.isControlDisplayed());

            // New Message
            newMessage.toTextBox.setText(mail);
            newMessage.subject.setText(randomText);
            newMessage.bodyMessage.setText(randomText);
            newMessage.sendButton.click();

            // Delete Message
            Session.getInstance().switchToDefaultFrame();
            inboxPanel.refreshButton.click();
            Session.getInstance().switchIFrame(iframeMessagePanel);
            inboxPanel.selectMessage.waitClickable();
            inboxPanel.selectMessage.click();

            Session.getInstance().switchToDefaultFrame();
            inboxPanel.deleteButton.click();
        }
}
