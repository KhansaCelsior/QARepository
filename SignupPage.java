import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This Page is used to store all methods and object of tsinguppage
 *
 * @author vgorantla
 *
 */
public class SignupPage extends BasePage{
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    // to register
    public void clickSignupLink() {
        waitForPageToLoad();
        lnksignup.click();

    }
// to fill the form and submit
   public void submitRegistrationForm(){
       String ran=RandomStringUtils.randomAlphabetic(5).toUpperCase();
       txtFirstName.sendKeys("firstname"+ran);
       txtLastName.sendKeys("firstname"+ran);
       int num=Integer.parseInt(RandomStringUtils.randomNumeric(5));
       txtEmail.sendKeys("vanaja"+ran+"@email.com");
       txtFirstName.sendKeys("firstname"+ran);
       txtFirstName.sendKeys("firstname"+ran);
       txtEmail.sendKeys("vanaja"+num+"@email.com");
       txtPassword.sendKeys("Password");
       btnCreateAccount.click();

   }

    public void signinAsadmin() {

        txtEmail.sendKeys("user2@email.com");
        txtPassword.sendKeys("Password");
        btnlogin.submit();

    }
    public void logout() {
        lnkLogout.click();

    }

    @FindBy(xpath = "//a[text()='signup']")
     WebElement lnksignup;

    @FindBy(xpath="//input[@id='First Name'")
    WebElement txtFirstName;

    @FindBy(xpath="//input[@id='Last Name'")
    WebElement txtLastName;

    @FindBy(xpath="//input[@id='Email'")
    WebElement txtEmail;

    @FindBy(xpath="//input[@id='password'")
    WebElement txtPassword;

    @FindBy(xpath = "//button[text()='signup']")
    WebElement btnCreateAccount;

    @FindBy(xpath = "//button[text()='login']")
    WebElement btnlogin;

    @FindBy(xpath="//a[text()='logout']")
    WebElement lnkLogout;
}
