import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdminFlow extends BaseTest{
    public WebDriver driver;
    SignupPage sgnup;
    AdminFlowPage afp;

    @Test
    public void testSignup() throws InterruptedException {
        driver = super.getDriver();
        driver.get(BaseURL+"/signin");
        sgnup.clickSignupLink();
        sgnup.signinAsadmin();
        afp.createQuizboard();
        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
        sgnup.logout();

    }
}
