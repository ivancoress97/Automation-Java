package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Clase encargada de interactuar con el driver
//Uso de los comandos de selenium en metodos
public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo clickar el elemento" + element);
        }

    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el elemento" + element);
        }

    }
    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el texto del elemento" + element);
        }

    }
    public String getTitle(By element) throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el titulo del driver" + element);
        }

    }
}
