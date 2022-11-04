package pages.PhpTravels;

import controlSelenium.Button;
import controlSelenium.CheckBox;
import controlSelenium.Control;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

import java.awt.*;

public class RegisterSection {
    public TextBox name = new TextBox(By.id("inputFirstName"),"[Name] textbox in register modal");
    public TextBox lastName = new TextBox(By.id("inputLastName"),"[LastName] textbox in register modal");
    public TextBox email = new TextBox(By.id("inputEmail"),"[Email] textbox in register modal");
    public TextBox phoneNumber = new TextBox(By.id("inputPhone"),"[PhoneNumber] textbox in register modal");
    public TextBox streetAddress = new TextBox(By.id("inputAddress1"),"[StreetAdress] textbox in register modal");
    public TextBox city = new TextBox(By.id("inputCity"),"[City] textbox in register modal");
    public TextBox state = new TextBox(By.id("stateinput"),"[State] textbox in register modal");
    public TextBox postCode = new TextBox(By.id("inputPostcode"),"[PostCode] textbox in register modal");
    public Button country = new Button(By.id("inputCountry"),"[Country] textbox in register modal");
    public Button argentinaOption = new Button(By.xpath("//select[@id='inputCountry']/option[@value='AR']"),"[Argentina] textbox option in register modal");
    public TextBox mobileWhatsappNumber = new TextBox(By.id("customfield2"),"[Mobile] textbox in register modal");
    public TextBox password = new TextBox(By.id("inputNewPassword1"),"[Password] textbox in register modal");
    public TextBox confirmPassword = new TextBox(By.id("inputNewPassword2"),"[ConfirmPassword] textbox in register modal");
    //public CheckBox captcha = new CheckBox(By.xpath("//div[@class='recaptcha-checkbox-border']"),"[Captcha] checkbox in register section");
    //public Button registerButton = new Button(By.xpath("//div[@class='recaptcha-checkbox-border']"),"[Register] button in register section");
    //public TextBox captchaIframe = new TextBox(By.xpath("//iframe[@title='reCAPTCHA']"),"Captcha Iframe");

    public CheckBox captchaCheckbox = new CheckBox(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]"),"[Captcha] Button on registration page");
    //public Button captchaButton = new Button(By.id("recaptcha-anchor-label"),"[Captcha] in register section");
    public Control captchaFrame = new Control(By.xpath("//iframe[@title=\"reCAPTCHA\"]"), "captchaFrame");
    public Button registerButton = new Button(By.xpath("//input[@class=\"btn btn-large btn-primary btn-recaptcha\"]"),"[Register] Button on registration page");

}
