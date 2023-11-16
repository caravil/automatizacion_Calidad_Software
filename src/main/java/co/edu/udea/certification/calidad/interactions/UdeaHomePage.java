package co.edu.udea.certification.calidad.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certification.calidad.userinterfaces.Homepage.INPUT_TEXT;
public class UdeaHomePage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Amazon").into(INPUT_TEXT).thenHit(Keys.RETURN));
    }
    public static UdeaHomePage go(){
        return Tasks.instrumented(UdeaHomePage.class);
    }
}
