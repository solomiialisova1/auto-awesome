package tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitUtils {
    private WebDriverWait wait;

    public WaitUtils(int timeoutInSeconds) {
        this.wait = new WebDriverWait(Browser.getInstance(), timeoutInSeconds);
    }

    public WebElement waitForElementToBeVisible(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public WebElement waitForElementToBeClickable(WebElement webElement) {
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public List<WebElement> waitForElementsToBeVisible(List<WebElement> list) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(list));
    }
}
