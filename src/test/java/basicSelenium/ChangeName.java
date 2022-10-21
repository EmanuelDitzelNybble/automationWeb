package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class ChangeName {
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
    public void deleteToDo() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


        // Login Steps:
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("emanuel.ditzel@nybblegroup.com");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("sennheiser1991");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        // Change Fullname
        driver.findElement(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]")).click(); //

        wait.until(elementToBeClickable(By.id(" FullNameInput")));

        driver.findElement(By.id("FullNameInput")).clear();
        driver.findElement(By.id("FullNameInput")).sendKeys("FullNameEdited");

        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        driver.findElement(By.xpath("//button//span[text()=\"Ok\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]")).click();

    }
}

