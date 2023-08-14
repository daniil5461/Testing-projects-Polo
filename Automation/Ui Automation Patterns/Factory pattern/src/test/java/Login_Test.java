import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class Login_Test {
    DriverManager driverManager;
    WebDriver driver;
    private CSVReader csvReader;
    String CombinationsPath="Login-password combinations.csv";
    String[] csvCell;
    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver=driverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void loginValidation()throws IOException, CsvValidationException {
        csvReader=new CSVReader(new FileReader(CombinationsPath));
        while((csvCell=csvReader.readNext())!=null) {
            String username=csvCell[0];
            String password=csvCell[1];
            driver.findElement(By.id("user-name")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            Assert.assertTrue(driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed());
        }

    }
    @AfterMethod
    public void killDriver(){
        driver.quit();
    }

}