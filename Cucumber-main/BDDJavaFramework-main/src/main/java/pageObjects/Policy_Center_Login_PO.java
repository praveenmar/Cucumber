package pageObjects;


import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utils.TestRunConfig;




public class Policy_Center_Login_PO extends Base_PO {


    public void navigateTo_WebDriverUniversity_Login_Page() {
        navigateTo_URL(TestRunConfig.BASE_URL);
    }

    private @FindBy(name = "Login-LoginScreen-LoginDV-username")
    WebElement username_TextField;


    private @FindBy(xpath = "//*[@id=\'Login-LoginScreen-LoginDV-password\']/div/input")
    WebElement password_TextField;

    private @FindBy(xpath = "//*[@id=\'Login-LoginScreen-LoginDV-submit\']/div")
    WebElement login_Button;


    public void setUsername(String username) {
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

    public void validate_UnsuccessfulLogin_Message() {
        waitForAlert_And_ValidateText("validation failed");
    }

    public void logsIntoApplication(String center, User user) {
        if (center.equalsIgnoreCase("PolicyCenter")) {
            navigateTo_URL(TestRunConfig.BASE_URL);
        } else if (center.equalsIgnoreCase("ClaimCenter")) {
            navigateTo_URL(TestRunConfig.BASE_URL1);
        } else if (center.equalsIgnoreCase("BillingCenter")) {
            navigateTo_URL(TestRunConfig.BASE_URL2);
        }
        setUsername(user.getUserId());
        setPassword(user.getPassword());
        clickOn_Login_Button();
    }
}

