import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddContactFacade {
    WebDriver driver;
    StartingPage sp;
    SignupPage sip;
    HomePage hp;
    AddContactPage acp;

    public boolean addContact(WebDriver driver,String fn, String ln, String date, String streetn, String streetn2, String state, String postal,String count, String email,String password){
        sp=new StartingPage(driver);
        sip=new SignupPage(driver);
        hp=new HomePage(driver);
        acp=new AddContactPage(driver);
        sp.signup();
        sip.signUp(fn,ln,email,password);
        hp.addContact();
        acp.addContact( fn,  ln,  date,  streetn,  streetn2,  state,  postal, count);
        return (driver.findElement(By.xpath("//td[normalize-space()="+"'"+fn+" "+ln+"']")).isDisplayed());

    }
}
