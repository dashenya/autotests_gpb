import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class FirstTestHomework extends BaseTest {
    HomePage homePage = new HomePage();

    @Test(description = "Выполнение домашнего задания")
    public void check2_main_page() {
        //Selenide.open("https://smmtouch.com");

//        homePage.get_buy_now_btn()
//                .shouldBe(Condition.visible)
//                .click();
        Assert.assertTrue("Окно для оплаты не открылось", homePage.get_popup_dialog().isDisplayed());
        homePage.get_popup_dialog_header().shouldBe(Condition.visible);
        homePage.get_any_input("Логин").sendKeys("DarkLord");
        homePage.get_any_input("Сколько").sendKeys("140");
        homePage.check_sum_in_pop()
                .shouldHave(Condition.not(Condition.text("0")))
                .shouldBe(Condition.visible);
        homePage.get_order_btn_in_pop().click();
        homePage.get_any_element_with_text("Банковская карта").shouldBe(Condition.visible);
        homePage.get_any_element_with_text("SberPay").shouldBe(Condition.visible);
        homePage.get_any_element_with_text("Qiwi").shouldBe(Condition.visible);
        homePage.get_any_element_with_text("Банковская карта").click();
        //WebDriverRunner.url().equals("https://paymore.org/pay/12ef2a239c-e6bd9c160c-927c14053e/card");

    }
}
