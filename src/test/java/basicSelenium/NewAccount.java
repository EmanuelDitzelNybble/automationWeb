package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NewAccount {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://todo.ly/");

    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void createAndEditAccount() throws InterruptedException {

        String mailName="mail"+new Date().getTime()+"@gmail.com";

        // Creating new account --------
        // Click SignUp
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img")).click();

        // Set name
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName")).sendKeys("emanuel");

        // Set email
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail")).sendKeys(mailName);

        // Set pwd
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword")).sendKeys("emanuelditzel");

        // Click checkbox
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms")).click();

        // Click Login button
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_ButtonSignup")).click();


        Thread.sleep(3000);
        // Change Password ---------
        // Click Settings button
        driver.findElement(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]")).click();

        // Set old pwd field
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.id("TextPwOld")).sendKeys("emanuelditzel");

        // Set new pwd field
        driver.findElement(By.id("TextPwNew")).sendKeys("emanuelditzelnew");

        // Click Ok button
        driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/button[1]/span")).click();

        // Click Logout button
        driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).click();


        Thread.sleep(3000);

        // Login with new password --------
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();

        // Set Email field
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(mailName);

        // Set pwd field
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]")).sendKeys("emanuelditzelnew");

        // Click Login Button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        // Click Logout Button
        driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).click();

        // Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),"ERROR de logueo");
        Thread.sleep(3000);
    }
}
