import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseTest {
    //protected HomePage homePage;

    @BeforeTest
    public void setup(){
        Configuration.baseUrl = "https://smmtouch.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "113.0";
        Configuration.remote = "http://192.168.100.2:4444/wd/hub";

        ChromeOptions options = new ChromeOptions();

        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            /* How to add test badge */
            put("name", "Первый тест");

            /* How to set session timeout */
            put("sessionTimeout", "15m");

            /* How to set timezone */
            put("env", new ArrayList<String>() {{
                add("TZ=UTC");
            }});


            /* How to enable video recording */
            put("enableVnc", true);
            put("enableVideo", true);
        }});


        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Selenide.open();
    }
}
