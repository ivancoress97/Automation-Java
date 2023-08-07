package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage{
    private By pageTitleLocator = By.xpath("//span[contains(text(),'HE LITTLE TESTER COMICS SERIES')]");
    private String titlePage = "HE LITTLE TESTER COMICS SERIES";


    public By getPageTitleLocator() {
        return pageTitleLocator;
    }

    public String getTitlePage() {
        return titlePage;
    }

    public ComicsPage(WebDriver driver) {
        super(driver);

    }
}
