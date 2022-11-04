package pages.PhpTravels;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class NavBarSection {
    public Button loginNavBarButton = new Button(By.xpath("//a[@class='jfHeader-menuListLink jfHeader-dynamicLink jfHeader-login-action']"), "[Login] button in navbar section");
    public Button SignUpNavBarButton = new Button(By.xpath("//a[@class='jfHeader-menuListLink jfHeader-dynamicLink jfHeader-signup-action']"), "[SignUp] button in navbar section");
}
