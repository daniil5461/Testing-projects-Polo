package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import pageobject.HomePage;
public class UserFound implements Question<String>{
    public static Question<String> displayed(){
        return new UserFound();
    }
    public String answeredBy(Actor actor){
return (Text.of(HomePage.NAME)).answeredBy(actor);
    }

}
