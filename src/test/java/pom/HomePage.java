package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{
    private String titleHomePage = "Testing | imalittletester";
    private By titleComicsLocator = By.id("comp-iiyocj9v5label");

    public String getTitleHomePage() {
        return titleHomePage;
    }

    public By getTitleComicsLocator() {
        return titleComicsLocator;
    }

    public HomePage(WebDriver driver){
        super(driver);
    }
}
