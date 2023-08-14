package pageobject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.Question;
public class HomePage extends PageObject {

    public static final Target SEARCHTXT=Target.the("Search")
            .locatedBy("//input[@placeholder='enter github user name']");
    public static final Target SEARCHBTN=Target.the("SearchBtn")
            .locatedBy("//button[@type='submit']");
    public static final Target NAME=Target.the("NAME")
            .locatedBy("//h4[normalize-space()='Danylo Polonskyi']");
}
