package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;

    private DriverManager driverManager;

    //Creamos una instancia del navegador que nos redirige a la pagina https://www.imalittletester.com/
    //Usamos el before para indicar que se ejecute antes de cada escenario
    @Before
    public void setUp(){

        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();
    }


    //Creamos un metodo que se ejecute despues de cada escenario
    @After
    public void tearDown(){
        //cerramos el navegador
        driverManager.quitDriver();
    }

    //Cremoas un metodo para retornar el driver
    public static WebDriver getDriver(){

        return driver;
    }
}
