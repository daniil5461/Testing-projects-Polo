import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class FacadeAddContactTest {
WebDriver driver;
AddContactFacade facade;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        facade=new AddContactFacade();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

@Test
public void addContactTest(){
        Assert.assertTrue(facade.addContact(driver,"Dan","Polo","01.10.2023","Prikol","","","21112","Ukraine","23331@gmail.com","kjkjkk333"));
}


    @AfterMethod
    public void killDriver(){
        driver.quit();
    }

}
