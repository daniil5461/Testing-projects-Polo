import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class ChromeDriverManager extends DriverManager {
    public ChromeDriverManager() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
}
