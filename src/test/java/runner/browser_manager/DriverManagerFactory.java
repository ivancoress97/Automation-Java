package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){

        DriverManager driverManager = null;

        switch(type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;

            case FIREFOX:
                driverManager = new ChromeDriverManager();
                break;

            default:
                System.out.println("browser invalid");
                break;
        }

        return driverManager;

    }

}
