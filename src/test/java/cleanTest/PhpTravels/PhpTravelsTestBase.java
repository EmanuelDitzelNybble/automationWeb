package cleanTest.PhpTravels;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.PhpTravels.LoginSection;
import pages.PhpTravels.NavBarSection;
import pages.PhpTravels.RegisterSection;
import singletonSession.Session;

public class PhpTravelsTestBase {

    public LoginSection loginSection = new LoginSection();
    public NavBarSection navBarSection = new NavBarSection();
    public RegisterSection registerSection = new RegisterSection();


    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://phptravels.com/demo/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
    @Attachment(value = "screenshot",type = "image/png")
    private byte[] attach(){
        //todo EJ1
        // tomar captura de pantalla - adjuntarlo en el reporte
        return ((TakesScreenshot) Session.getInstance().getBrowser()).getScreenshotAs(OutputType.BYTES);
    }
}

