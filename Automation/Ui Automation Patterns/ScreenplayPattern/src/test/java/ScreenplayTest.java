import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import questions.UserFound;
import tasks.SearchTask;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class ScreenplayTest {
    private Actor daniil5461=Actor.named("daniil5461");
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void demoUserCanBrowseTheWeb(){
        daniil5461.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void browseTheWebAsDemoUser(){
        daniil5461.attemptsTo(Open.url("https://gh-users-search.netlify.app/"));
        givenThat(daniil5461).attemptsTo(SearchTask.withCredentials("daniil5461"));
        then(daniil5461).should(seeThat(UserFound.displayed(), CoreMatchers.equalTo("Danylo Polonskyi")));
    }
}
