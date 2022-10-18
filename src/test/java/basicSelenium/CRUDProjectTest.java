package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CRUDProjectTest {

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
        public void createNewProject() throws InterruptedException {
            // click login
            driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
            // set email
            driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("emanuelll@hotmail.com");
            // set pwd
            driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("emanuel");
            // click login
            driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

            // Create
            // click add new project
            driver.findElement(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]")).click();
            // set name project
            driver.findElement(By.id("NewProjNameInput")).sendKeys("New Project");
            // click add button
            driver.findElement(By.id("NewProjNameButton")).click();



            // //li[last()]//td(text)'New Project']





            Thread.sleep(2000);


        }
    }

    /*
    CREATE
click addNewProject ->  //td[text()='Add New Project']
Set nameProject - > NewProjNameInput
click Add -> NewProjNameButton
verification -> //li[last()]//td[text()='NOMBRE PROJ']

UPDATE

Click project to update  //li[last()]//td[text()='NOMBRE PROJ']
click menu icon  //div[contains(@style,'block')]/img
click Edit  //ul[@id="projectContextMenu"]//a[text()='Edit']
Clear the nameProject  ItemEditTextbox
Set new ProjectName   ItemEditTextbox
Click save button  //td/div[@id="ProjectEditDiv"]/img[@id='ItemEditSubmit']
verification //li[last()]//td[text()='NEW NOMBRE PROJ']

DELETE
Click project to update  //li[last()]//td[text()='NEW NOMBRE PROJ']
click menu icon //div[contains(@style,'block')]/img
click DELETE   ProjShareMenuDel
click accept alert    driver.switchTo().alert().accept();
verification  //li[last()]//td[text()='NEW NOMBRE PROJ']
     */