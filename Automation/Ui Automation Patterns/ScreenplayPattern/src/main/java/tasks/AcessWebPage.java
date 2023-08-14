package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import pageobject.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcessWebPage implements Task {
    public static AcessWebPage loginPage() {
        return instrumented(AcessWebPage.class);
    }



    HomePage homePage;

    @Step("{0} access Login page")
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Open.browserOn().the(homePage));
    }
}
