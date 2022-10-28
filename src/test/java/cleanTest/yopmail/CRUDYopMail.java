package cleanTest.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.sql.Driver;
import java.util.Date;

public class CRUDYopMail extends TestBaseYopMail {
        @Test
        public void yopMail() throws InterruptedException {
            // Login
            //login.mail.setText(k.mail);
            login.emailButton.click();
            inboxPanel.newMessageButton.click();
            //Session.getInstance().switchIFrame(k.iframeInbox);
            Assertions.assertTrue(newMessage.sendButton.isControlDisplayed(), "Error, login failed.");
            Assertions.assertFalse(login.clearButton.isControlDisplayed());

            // New Message
            //newMessage.toTextBox.setText(k.mail);
            //newMessage.subject.setText(k.randomText);
            //newMessage.bodyMessage.setText(k.randomText);
            newMessage.sendButton.click();

            // Delete Message
            Session.getInstance().switchToDefaultFrame();
            inboxPanel.refreshButton.click();
            //Session.getInstance().switchIFrame(k.iframeMessagePanel);
            inboxPanel.selectMessage.waitClickable();
            inboxPanel.selectMessage.click();

            Session.getInstance().switchToDefaultFrame();
            inboxPanel.deleteButton.click();
        }
}
