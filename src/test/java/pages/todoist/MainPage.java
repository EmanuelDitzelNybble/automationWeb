package pages.todoist;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button lastProject = new Button(By.xpath("//ul[@id=\"projects_list\"]/li[last()]"));
    public Button projectButton = new Button(By.xpath("//li[last()]//div[@class=\"fgALZGUA6SZg9blSarq2hg== _7DCqR7o3BYjme7edphDp8A== f9408a0e _0e4ff085\"]"));
}
