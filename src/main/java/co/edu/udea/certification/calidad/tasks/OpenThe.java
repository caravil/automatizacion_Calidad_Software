package co.edu.udea.certification.calidad.tasks;

import co.edu.udea.certification.calidad.interactions.UdeaHomePage;
import co.edu.udea.certification.calidad.userinterfaces.Homepage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import static co.edu.udea.certification.calidad.userinterfaces.Homepage.INPUT_TEXT;

public class OpenThe implements Task {

    private final PageObject page;

    public OpenThe(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(page),
                UdeaHomePage.go()
        );
    }

    public static OpenThe Browser(Homepage page) {
        return Tasks.instrumented(OpenThe.class, page);
    }
}
