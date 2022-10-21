package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ModifyingToDo {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://todo.ly/");
    }

    @AfterEach
    public void cleanUp(){

        driver.quit();
    }

    @Test
    public void deleteToDo() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        // Login Steps:
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("emanuel.ditzel@nybblegroup.com");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("sennheiser1991");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        // Creating Project
        String projectName="Project"+new Date().getTime();
        driver.findElement(By.xpath("//td[text()='Add New Project']")).click();
        driver.findElement(By.id("NewProjNameInput")).sendKeys(projectName);
        driver.findElement(By.id("NewProjNameButton")).click();

        wait.until(ExpectedConditions.textToBe(By.xpath("//li[last()]//td[text()='"+projectName+"']"),projectName));

        String actualResult = driver.findElement(By.xpath("//li[last()]//td[text()='"+projectName+"']")).getText();
        String expectedResult = projectName;
        Assertions.assertEquals(expectedResult, actualResult, "Error while creating project");

        // Creating Task
        String toDo = "New To Do";
        String editedToDo = "To Do modified";
        driver.findElement(By.id("NewItemContentInput")).sendKeys(toDo);
        driver.findElement(By.id("NewItemAddButton")).click();
        //Assertions.assertEquals(driver.findElement(By.xpath("//ul[@id=\"mainItemList\"]/li[last()]//*[@class=\"ItemContentDiv\"]")).getText(),projectName);

        // Editing Task
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[text()='"+toDo+"']")).click();
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).clear();
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).sendKeys(editedToDo + Keys.ENTER);
        wait.until(ExpectedConditions.not(visibilityOf(driver.findElement(By.xpath("//img[@id=\"LoaderImg\" and contains(concat(' ', @style, ' '), ' display: block;')]"))))); // esto editar
        Assertions.assertEquals(editedToDo,driver.findElement(By.xpath("//div[text()='"+editedToDo+"']")).getText(),"ERROR while editing item");
        action.moveToElement(driver.findElement(By.xpath("//div[text()='"+editedToDo+"']"))).pause(Duration.ofSeconds(2)).perform();
        Thread.sleep(4000);

    }
}
