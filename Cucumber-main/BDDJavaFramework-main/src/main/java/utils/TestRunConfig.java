package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestRunConfig{
    private static Logger log = LoggerFactory.getLogger(TestRunConfig.class);
    public static String BROWSER = get("browser");
    public static final boolean IS_PARALLEL = Boolean.parseBoolean(get("isParallel"));
    public static final String THREAD_COUNT = get("threadCount");
    public static String ENV = get("env");
    public static String ENV1=get("env_1");
    public static String ENV2=get("env_2");
    public static String BASE_URL = getBaseUrl(ENV);
    public static String BASE_URL1=getBaseUrl(ENV1);
    public static String BASE_URL2=getBaseUrl(ENV2);
    public static int RETRY_COUNTER=Integer.parseInt(get("retryCounter"));

    public static final boolean ScreenShot_All = Boolean.parseBoolean(get("screenshotForAll"));
    public static String EXCEL_FILE_NAME = get("excelFileName");

    //BrowserStack
    public static String BS_USERNAME = get("bsUserName");
    public static String BS_ACCESSKEY = get("bsAccessKey");
    public static String BS_BROWSERNAME = get("browserName");
    public static String BS_DEVICE = get("device");
    public static String BS_OSVERSION = get("os_version");


    public TestRunConfig() {
    }

    public static String get(String property) {
        String value = null;

        if (System.getenv(property) != null) {
            value = System.getenv(property);
            log.info(String.format("from env:%s:%s", property, value));
        } else if (System.getenv(property.toUpperCase()) != null) {
            value = System.getenv(property);
            log.info(String.format("from env:%s:%s", property.toLowerCase(), value));
        } else if (System.getProperty(property) != null) {
            value = System.getProperty(property);
            log.info(String.format("from property:%s:%s", property, value));
        } else {
            try {
                FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
                Properties properties = new Properties();
                properties.load(inputStream);
                value = properties.getProperty(property);

            }catch (IOException ex){
                log.error("config.properties file not found");
            }
        }
        return value;
    }
    private static String getBaseUrl(String key) {
        String value=null;
        try {
            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/environment.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            value = properties.getProperty(key + ".base.url");
        }catch (IOException ex){
            log.error("environment.properties file not found");
        }
        return value;
    }
}

