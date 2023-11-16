package co.edu.udea.certification.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;


public class Homepage extends PageObject {

    public static final Target INPUT_TEXT = Target.the("INPUT_TEXT").located(By.name("q"));
    public static final Target INPUT_TEXT1 = Target.the("INPUT_TEXT").locatedBy("//*[@id='APjFqb']");
}
