package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void createNewAccount() throws InterruptedException {
        // click login
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img")).click();
        // set email
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName")).sendKeys("emanuel");
        // set pwd
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail")).sendKeys("emanuellll@hotmail.com");
        // click login
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword")).sendKeys("emanuelditzel");

        driver.findElement(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms")).click();

        driver.findElement(By.id("ctl00_MainContent_SignupControl1_ButtonSignup")).click();

        // Change Password


    }
}