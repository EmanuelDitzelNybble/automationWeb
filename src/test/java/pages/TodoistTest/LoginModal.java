package pages.TodoistTest;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginModal {

        public TextBox emailTextBox = new TextBox(By.id("element-0"), "[Email] textbox in login modal");
        public TextBox passwordTextBox = new TextBox(By.id("element-3"), "[Password] textbox in login modal");
        public Button loginButton = new Button(By.xpath("//button[@type=\"submit\"]"), "[login] button in login modal");
        public Button inboxButtonDisplayed = new Button(By.xpath("//*[text()='Inbox']"), "[Inbox] button displayed in login modal");

        public void login(String user,String pwd){
            emailTextBox.setText(user);
            passwordTextBox.setText(pwd);
            loginButton.click();
        }
}

