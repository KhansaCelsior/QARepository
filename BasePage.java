import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
/*
 *base page which would be exended by all the pages
 *
 * @author VanajaGorantla
 */

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, 30);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public  void waitForPageToLoad() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String pageLoadStatus = null;

        do {
            pageLoadStatus = (String)js.executeScript("return document.readyState", new Object[0]);
        } while(!pageLoadStatus.equals("complete"));

    }
}
