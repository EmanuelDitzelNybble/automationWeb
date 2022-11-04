package cleanTest.PhpTravels;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.util.Date;

public class PhpTravelsRegistrationTest extends PhpTravelsTestBase {
    @Test
    public void registrationTest() throws InterruptedException {
        String name = "Emanuel";
        String lastName = "Ditzel";
        String email = "ditzelemanuel@gmail.com" + new Date();
        String phoneNumber = "2915279156";
        String streetAddress = "12 de Octubre";
        String city = "Bahia Blanca";
        String state = "Buenos Aires";
        String postCode = "8000";
        String password = "danger1234";
        String confirmPwd = "danger1234";
        String registerURL = "https://phptravels.org/register.php";
        String loginURL = "https://phptravels.org/login";
        String captchaIframe = "a-owwur1rfpo8l";



        navBarSection.SignUpNavBarButton.click();

        Session.getInstance().changeTab(registerURL);
        registerSection.name.waitClickable();
        registerSection.name.setText(name);
        registerSection.lastName.setText(lastName);
        registerSection.email.setText(email);
        registerSection.phoneNumber.setText(phoneNumber);
        registerSection.streetAddress.setText(streetAddress);
        registerSection.city.setText(city);
        registerSection.state.setText(state);
        registerSection.postCode.setText(postCode);
        registerSection.country.click();
        registerSection.argentinaOption.waitClickable();
        registerSection.argentinaOption.click();
        registerSection.mobileWhatsappNumber.setText(phoneNumber);
        registerSection.password.setText(password);
        registerSection.confirmPassword.setText(confirmPwd);

        Session.getInstance().getBrowser().switchTo().frame(registerSection.captchaFrame.getAttribute("name"));

        //registerSection.captchaCheckbox.waitClickable();
        registerSection.captchaCheckbox.waitToElementToBePresent();
        registerSection.captchaCheckbox.waitClickable();
        registerSection.captchaCheckbox.check();
        Thread.sleep(5000);

        Session.getInstance().switchToDefaultFrame();
        registerSection.registerButton.waitClickable();
        registerSection.registerButton.click();
        Thread.sleep(5000);

        Session.getInstance().changeTab("https://phptravels.com/demo/");
        navBarSection.loginNavBarButton.waitClickable();
        navBarSection.loginNavBarButton.click();

        Session.getInstance().changeTab("https://phptravels.org/login");

    }
}