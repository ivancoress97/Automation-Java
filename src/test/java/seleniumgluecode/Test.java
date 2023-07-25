package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Throwable {

        String titleHomePage = "Testing | imalittletester";
        Assert.assertEquals(titleHomePage, driver.getTitle());

    }

    @When("^hace click sobre el boton de Latest Comics$")
    public void hace_click_sobre_el_boton_de_Latest_Comics() throws Throwable {

        WebElement titleComicsLocator = driver.findElement(By.id("comp-iiyocj9v5label"));
        titleComicsLocator.click();


    }

    @Then("^Se debe de dirigir a la pantalla comics$")
    public void se_debe_de_dirigir_a_la_pantalla_comics() throws Throwable {

        WebElement pageTitleLocator = driver.findElement(By.xpath("//span[contains(text(),'HE LITTLE TESTER COMICS SERIES')]"));
        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics", pageTitleLocator.isDisplayed());
        Assert.assertEquals("HE LITTLE TESTER COMICS SERIES", pageTitleLocator.getText());


    }
}
