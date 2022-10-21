package pages.todo.ly;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MenuSection {

    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));
    public Button settings = new Button(By.xpath("//a[text()='Settings']"));
}


