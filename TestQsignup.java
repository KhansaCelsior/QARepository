import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class TestQsignup extends BaseTest{
    public WebDriver driver;
    SignupPage sgnup;

    /*to verify the signup functionality
    *
    * @author vgorantla
    * */
    @Test
    public void testSignup() throws InterruptedException {
        driver = super.getDriver();
        driver.get(BaseURL+"/signup");
        sgnup.clickSignupLink();
        sgnup.submitRegistrationForm();
        Assert.assertTrue(driver.getCurrentUrl().contains("quiz"));
        sgnup.logout();
    }
    /*to verify the signin functionality and signout
     *
     * @author vgorantla
     * */
    @Test
    public void signInAsAdmin() throws InterruptedException {
        driver = super.getDriver();
        driver.get(BaseURL+"/signin");
        sgnup.signinAsadmin();
        Assert.assertTrue(driver.getCurrentUrl().contains("quiz"));
        sgnup.logout();
    }

}

