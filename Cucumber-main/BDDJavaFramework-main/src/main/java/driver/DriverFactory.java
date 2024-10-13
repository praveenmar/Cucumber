package driver;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.TestRunConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Properties;

public class DriverFactory {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();


    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }


    private static WebDriver createDriver() {
        WebDriver driver = null;
        //WebDriver delegate ;
        switch (getBrowserType()) {
            case "chrome" -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                //healenium
                //delegate = new ChromeDriver(chromeOptions);
                //driver = SelfHealingDriver.create(delegate);
                driver =new ChromeDriver(chromeOptions);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
                break;
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new FirefoxDriver(firefoxOptions);
                break;
            }
            case "bschromeandroid" -> {
                try {
                    final String AUTOMATE_USERNAME = TestRunConfig.BS_USERNAME;
                    final String AUTOMATE_ACCESS_KEY = TestRunConfig.BS_ACCESSKEY;
                    final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setCapability("browserName", TestRunConfig.BS_BROWSERNAME);
                    caps.setCapability("device", TestRunConfig.BS_DEVICE);
                    caps.setCapability("realMobile", "true");
                    caps.setCapability("os_version", TestRunConfig.BS_OSVERSION);
                    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
                    caps.setCapability("build", "BStack Build Number Test");
                    driver = new RemoteWebDriver(new URL(URL), caps);
                }catch(MalformedURLException e){
                    e.printStackTrace();
                }
                break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static String getBrowserType() {
        String browserType = null;

        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
            properties.load(file);
            browserType = properties.getProperty("browser").toLowerCase().trim();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return browserType;
    }

    public static void cleanupDriver() {
        webDriver.get().quit();
        webDriver.remove();
    }
}
