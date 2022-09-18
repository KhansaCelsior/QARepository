import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/*
 *base page which would be exended by all the Tests
 *
 * @author VanajaGorantla
 */
public class BaseTest {
    public WebDriver driver;
     String BaseURL;
    @BeforeTest
    public void beforeTest() throws IOException,FileNotFoundException {
        FileReader propertiesFile=new FileReader("C:\\work\\qboard\\src\\test\\Props.properties");
        Properties p =new Properties();
        p.load(propertiesFile);
        String browser=p.get("browser").toString();
        BaseURL= p.getProperty("url");
        driver= Driver.createDriver(browser);
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));

    }
    @AfterTest
    public void tearDown(){
       driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
}
