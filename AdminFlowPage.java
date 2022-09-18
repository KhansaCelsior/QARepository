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
public class AdminFlowPage extends BasePage {
    public AdminFlowPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateQuiz() {
        waitForPageToLoad();
        btnCreateQuiz.click();

    }
    public void clickSelectSubject() {

        btnSubject.click();

    }
    public void createQuizboard() {

        qustiontype.click();

        txtquestion.sendKeys("what is implicit wait");

        btncreateboard.click();
    }
    @FindBy(xpath = "//button[text()='create']")
    WebElement btnCreateQuiz;

    @FindBy(xpath="//button[contains(@id(),'subject')]")
    WebElement btnSubject;

    @FindBy(xpath="//input['@id='mcq')")
    WebElement qustiontype;

    @FindBy(xpath="//input['text='question1')")
    WebElement txtquestion;

    @FindBy(xpath="//button[contains(@id(),'startQuiz')]")
    WebElement btncreateboard;


}
