package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    private SelenideElement logo = $x("//a[img[@alt='Logo']]");
    private SelenideElement insta_btn = $x("//section[contains(@class, 'banner3')]//button[normalize-space(.)='Раскрутить Инстаграм']");
    private String carusel_hdr = "//li[contains(@class, 'carousels3__hooper-slide') and contains(@class, 'is-active')]//h3[normalize-space(.)='%s']";

    //private Object services;
    private SelenideElement buy_now_btn = $x("//li[contains(@class, 'carousels3__hooper-slide') and contains(@class, 'is-active')]//div[contains(@class, 'carousels-card')][.//h3[normalize-space(.)='100 Подписчиков']]//button");
    private SelenideElement popup_dialog = $x("//div[contains(@class, 'popup__dialog')]");
    private SelenideElement popup_dialog_header = $x("//fieldset//h3[normalize-space(.)='Подписчики в Инстаграм']");

    private SelenideElement sum_in_pop = $x("//span[contains(@class, 'amount')]");
    private SelenideElement order_btn_in_pop = $x("//button[contains(@class, 'order__button')]");


    @Step("Получим карусель {text}")
    public SelenideElement get_carusel_hdr(String text) {
        return $x(String.format(carusel_hdr,text));
    }
    @Step("Получим логотип")
    public SelenideElement get_logo() {
        return logo;
    }
    @Step("Получим инстакнопку")
    public SelenideElement get_insta_btn() {
        return insta_btn;
    }
    @Step("Получим кнопку Купить_сейчас")
    public SelenideElement get_buy_now_btn() {
        return buy_now_btn;
    }
    @Step("Получим диалоговое окно")
    public SelenideElement get_popup_dialog() {
        return popup_dialog;
    }
    @Step("Получим заголовок диалогового окна")
    public SelenideElement get_popup_dialog_header() {
        return popup_dialog_header;
    }

    @Step("Получим итоговую сумму")
    public SelenideElement check_sum_in_pop() {
        return sum_in_pop;
    }
    @Step("Получим кнопку перехода к оплате")
    public SelenideElement get_order_btn_in_pop() {
        return order_btn_in_pop;
    }


}
