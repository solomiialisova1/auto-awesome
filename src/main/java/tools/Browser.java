package tools;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getInstance() {
        if (driver.get() == null) {
            WebDriverManager.chromedriver().driverVersion("122.0.6261.94").setup();
            driver.set(new ChromeDriver());
        }
        return driver.get();
    }

    public static void quit() {
        driver.get().quit();
        driver.remove();
    }
}
