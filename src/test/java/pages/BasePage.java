package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    private String any_input = "//input[contains(@placeholder, '%s')]";
    private String any_element_with_text = "//span[normalize-space(.)='%s']";
    @Step("Получим инпут {text}")
    public SelenideElement get_any_input(String text) {
        return $x(String.format(any_input,text));
    }
    @Step("Получим способ оплаты {text}")
    public SelenideElement get_any_element_with_text(String text) {
        return $x(String.format(any_element_with_text,text));
    }
}
