package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberOfCase = 0;

    //Creamos una instancia del navegador que nos redirige a la pagina https://www.imalittletester.com/
    //Usamos el before para indicar que se ejecute antes de cada escenario
    @Before
    public void setUp(){

        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario nro: "+numberOfCase);
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();
    }


    //Creamos un metodo que se ejecute despues de cada escenario
    @After
    public void tearDown(){
        //cerramos el navegador
        driver.quit();
    }

    //Cremoas un metodo para retornar el driver
    public static ChromeDriver getDriver(){

        System.out.println("El escenario nro: "+ numberOfCase +" se ejecuto correctamente.");
        return driver;
    }
}
