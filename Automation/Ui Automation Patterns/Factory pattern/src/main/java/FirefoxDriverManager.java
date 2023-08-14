import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{
    public FirefoxDriverManager() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }
}
