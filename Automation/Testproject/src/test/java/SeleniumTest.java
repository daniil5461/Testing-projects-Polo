import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import  java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
    private static ChromeDriver driver;

    @BeforeEach
public  void openChrome(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
@Test
        public void TestSite(){
    driver.get("https://codepen.io/");
    Assertions.assertEquals("CodePen: Online Code Editor and Front End Web Developer Community", driver.getTitle());
}
@AfterEach
    public  void closeChrome(){
        driver.quit();
}
}
