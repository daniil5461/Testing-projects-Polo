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
import org.openqa.selenium.WebDriver;
public class RozetkaHomePage {
    WebDriver driver;
    //By LoginButton=By.className("header__button ng-star-inserted");
    By SearchInputTextbox=By.xpath("//input[@placeholder='Я шукаю...']");
    By SearchButton=By.cssSelector(".button.button_color_green.button_size_medium.search-form__submit");
   // By SearchInputTextboxWithInput=By.className("search-form__input ng-pristine ng-valid ng-touched");
    //By LeftMenuButton=By.className("header__button ng-tns-c40-1");
   // By CartButton=By.className("header__button ng-star-inserted");
    //By UALocalizationButton=By.className("lang__link ng-star-inserted");
   // By RuLocalizationButton=By.className("lang__link ng-star-inserted");
    public RozetkaHomePage(WebDriver driver){
        this.driver=driver;
    }
    public void SearchInput(String input){
        driver.findElement(SearchInputTextbox).sendKeys(input);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(SearchButton).click();
    }
}
