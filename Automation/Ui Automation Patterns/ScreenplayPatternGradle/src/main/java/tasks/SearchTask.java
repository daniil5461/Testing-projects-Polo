package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import pageobject.HomePage;


public class SearchTask implements Task {
    @Step("{0} enter github username '#username'")
            public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Enter.theValue(username).into(HomePage.SEARCHTXT));
        actor.attemptsTo(Click.on(HomePage.SEARCHBTN));
    }
    private String username;
    public SearchTask(String username) {
        this.username = username;

    }
    public static Task withCredentials(String username) {
        return Instrumented
                .instanceOf(SearchTask.class)
                .withProperties(username);
    }
}
