package pageObjects;

import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestRunConfig;

public class Claim_flow_PO  extends Base_PO {

    private @FindBy(name = "Login-LoginScreen-LoginDV-username")
    WebElement username_TextField;

    private @FindBy(xpath = "//*[@id=\'Login-LoginScreen-LoginDV-password\']/div/input")
    WebElement password_TextField;

    private @FindBy(xpath = "//*[@id=\'Login-LoginScreen-LoginDV-submit\']/div")
    WebElement login_Button;
    private @FindBy(xpath="//*[@id=\"TabBar-ClaimTab\"]/div[3]/div")
    WebElement Click_On_Claim_Tab;
    private @FindBy(xpath="//*[@id=\"TabBar-ClaimTab-ClaimTab_FNOLWizard\"]/div")
    WebElement click_on_new_claim;
    private @FindBy(xpath="//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-policyNumber\"]/div/input")
     WebElement policy_number;
    public void setUsername(String username) {
        sendKeys(username_TextField, username );
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password );
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }



    public void logsIntoApplication(User user){

        navigateTo_URL(TestRunConfig.BASE_URL1);
        setUsername(user.getUserId());
        setPassword(user.getPassword());
        clickOn_Login_Button();
    }
    public void click_on_claim(){
        waitForWebElementAndClick(Click_On_Claim_Tab);
        waitForWebElementAndClick(click_on_new_claim);
    }
}

