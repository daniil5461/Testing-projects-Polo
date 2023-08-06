import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
public class POMTestSuit {
    WebDriver driver;
    LoginPage lp;
    CatalogPage cp;
    CartTab ct;
    CheckoutPage chp;
    CheckoutFinishPage cfp;
    CheckoutFinishCongratulationPage cfcp;

    @BeforeMethod
    public void setUp(){
    driver=BaseClass.init();
    lp=new LoginPage(driver);
    cp=new CatalogPage(driver);
    ct=new CartTab(driver);
    chp=new CheckoutPage(driver);
    cfp=new CheckoutFinishPage(driver);
    cfcp=new CheckoutFinishCongratulationPage(driver);
    lp.Login("standard_user","secret_sauce");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test(priority = 1)
    public void loginIsValid(){
        Assert.assertTrue(cp.cartisDisplayed());
    }
    @Test(priority = 2)
    public void logoutFunctioning(){
        cp.leftSideBar();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        cp.logoutClick();
        Assert.assertTrue(lp.usernameIsDisplayed());
    }
    @Test(priority=3)
    public void cartValidation(){
        cp.cartClick();
        ct.CheckoutClick();
        chp.InfoFillout("Danylo","Polonskyi","1229045");
        chp.continueClick();
        cfp.FinishClick();
        Assert.assertTrue(cfcp.backHomeIsDisplayed());
    }

    @AfterMethod
    private void driverQuit(){
        driver.quit();
    }
}
