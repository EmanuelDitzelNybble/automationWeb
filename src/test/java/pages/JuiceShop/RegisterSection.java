package pages.JuiceShop;

import controlSelenium.Button;
import controlSelenium.Control;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {
        public TextBox emailAddress = new TextBox(By.xpath("//input[@id='emailControl']"),"");
        public TextBox passwordRegistration = new TextBox(By.xpath("//input[@id='passwordControl']"),"");
        public TextBox repeatPassword = new TextBox(By.xpath("//input[@id=\"repeatPasswordControl\"]"),"");
        public Button securityQuestion = new Button(By.xpath("//div[@class=\"security-container\"]/mat-form-field[@class]"),"");
        public TextBox answer = new TextBox(By.xpath("//input[@id='securityAnswerControl']"),"");
        public Button registerButton = new Button(By.xpath("//button[@id='registerButton']"),"");
        public Button motherNameOption = new Button(By.id("mat-option-4"),"");
        //public Button motherNameOption = new Button(By.xpath("//mat-option[@id='mat-option-18']"));
        //mat-option[@id="mat-option-17"]
}
