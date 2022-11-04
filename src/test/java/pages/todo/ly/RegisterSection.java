package pages.todo.ly;

import controlSelenium.Button;
import controlSelenium.CheckBox;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"),"");
    public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"),"");
    public TextBox fullNameTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"),"");
    public Button registerButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"),"");
    public CheckBox checkBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"),"");

    public void register(String user,String email,String password){
        emailTextBox.setText(email);
        passwordTextBox.setText(password);
        fullNameTextBox.setText(user);
        checkBox.click();
        registerButton.click();
    }
}
