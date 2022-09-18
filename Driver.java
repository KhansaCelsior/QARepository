import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
/*
 * class for driver creation
 *
 * @author VanajaGorantla
 */

public  class Driver {
    public static WebDriver driver;
     public static WebDriver createDriver(String Browser){
         if(Browser.equalsIgnoreCase("chrome")){
             System.setProperty("webdriver.chrome.driver", "C:\\devopsPoc\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().deleteAllCookies();
             driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         }else{
             System.out.println(" yet to be configured");
         }
         return driver;
    }
}
