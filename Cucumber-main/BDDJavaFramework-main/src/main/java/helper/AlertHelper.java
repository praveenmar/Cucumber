package helper;

import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlertHelper {
    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    private static Logger log = LoggerFactory.getLogger(AlertHelper.class);

    public Alert getAlert() {
        log.debug("");
        return getDriver().switchTo().alert();
    }

    public void AcceptAlert() {
        log.info("");
        getAlert().accept();
    }

    public void DismissAlert() {
        log.info("");
        getAlert().dismiss();
    }

    public String getAlertText() {
        String text = getAlert().getText();
        log.info(text);
        return text;
    }

    public boolean isAlertPresent() {
        try {
            getDriver().switchTo().alert();
            log.info("Alert present");
            return true;
        } catch (NoAlertPresentException e) {
            // Ignore
            log.info("Alert not present");
            return false;
        }
    }

    public void AcceptAlertIfPresent() {
        if (!isAlertPresent())
            return;
        AcceptAlert();
        log.info("");
    }

    public void DismissAlertIfPresent() {

        if (!isAlertPresent())
            return;
        DismissAlert();
        log.info("");
    }

    public void AcceptPrompt(String text) {

        if (!isAlertPresent())
            return;

        Alert alert = getAlert();
        alert.sendKeys(text);
        alert.accept();
        log.info(text);
    }
}
