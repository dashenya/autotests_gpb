import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTest {
    //protected HomePage homePage;

    @BeforeTest
    public void setup(){
        Configuration.baseUrl = "https://smmtouch.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Selenide.open();
    }
}
