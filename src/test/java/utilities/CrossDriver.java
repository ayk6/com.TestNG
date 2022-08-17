package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {
    // page object modelde driver için extends yerine driver classında
    // static methodlar oluşturulur
    // POM'de Driver class'ındaki getDriver methoduna obje ile
    // ulaşılmasını engellemek için Singleton Pattern kullanılır
    // Singleton Pattern = Tekil kullanım - obje ile kullanılamaz
    // constructor private yapılır

    // farklı browserlarda test yapmak için crossDriver kullanılır
    // Webdriver methoduna string değişken atandı
    // istenen browser yazılarak method çalıştırılır

    private CrossDriver() {
    }

    public static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        browser = (browser == null) ? (ConfigReader.getProperty("browser")) : browser;

        if (driver == null) {
            switch (browser) {
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                default:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
        }
        driver = null;
    }
}
