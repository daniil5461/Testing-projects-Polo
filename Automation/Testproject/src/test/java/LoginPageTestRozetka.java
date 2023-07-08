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
import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPageTestRozetka {

    private static ChromeDriver driver;

    RozetkaHomePage objRozetkaHomePage;

@BeforeEach
    public void Setup(){

    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://rozetka.com.ua/ua/");
}
@Test
public void SearchTextboxTest(){
    objRozetkaHomePage=new RozetkaHomePage(driver);
    objRozetkaHomePage.SearchInput("Samsung");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterEach
    public void DriverCLose(){
    driver.quit();
}

}
