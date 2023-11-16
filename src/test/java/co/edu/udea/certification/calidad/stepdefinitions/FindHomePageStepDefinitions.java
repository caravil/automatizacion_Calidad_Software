package co.edu.udea.certification.calidad.stepdefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import co.edu.udea.certification.calidad.tasks.OpenThe;
import co.edu.udea.certification.calidad.userinterfaces.Homepage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class FindHomePageStepDefinitions {

    private Actor estudiante = Actor.named("carlos");
    @Managed(driver = "chrome")
    public WebDriver driver;

    @Before
    public void preInit() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("que me encuentro en la pagina principal de google")
    public void queMeEncuentroPaginaGoogle() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        estudiante.can(BrowseTheWeb.with(driver));
    }

    @When("escriba la palabra Amazon")
    public void escribaLaPalabraAmazon() {
        estudiante.attemptsTo(OpenThe.Browser(new Homepage()));
    }

    @Then("puedo ver el link de la pagina oficial")
    public void puedoVerElLink() {
        // Implementa las validaciones necesarias aquí
    }

}
