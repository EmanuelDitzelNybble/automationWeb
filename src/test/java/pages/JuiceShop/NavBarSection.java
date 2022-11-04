package pages.JuiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class NavBarSection {
    public Button accountButton = new Button(By.xpath("//button[@id=\"navbarAccount\"]"),"");
    public Button loginButton = new Button(By.xpath("//button[@id='navbarLoginButton']"),"");
    public Button logoutButton = new Button(By.id("navbarLogoutButton"),"");
    public Button cartBasket = new Button(By.xpath("//button[@routerlink=\"/basket\"]"),"");
    public Button openSideButton = new Button(By.xpath("//mat-icon[normalize-space()='menu']"),"");
}
