package pages.TickTick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    //public Button signUp = new Button(By.xpath("//div[@class='navRow_236y3 container']//a[@class='signupBtn_2APvt'][normalize-space()='Sign Up for Free']"));
    public Button signUp = new Button(By.xpath("//div[@class='navRow_236y3 container']//a[text()='Sign Up for Free']"),"");
    public Button signIn = new Button(By.xpath("//div[@class='navRow_236y3 container']//a[normalize-space()='Sign In']"),"");
}
