package ru.netology;

import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class cardDelivery {

    @Test
    void cardDeliveryOrder() {
        open("http://localhost:9999");
        $("[data-test-id=city] .input__control").setValue("Ижевск");
        $("[data-test-id=date] .icon").click();
        $("[data-test-id=name] .input__control").setValue("Филимонов Станислав");
        $("[data-test-id=phone] .input__control").setValue("+79127468585") .waitUntil(Condition.visible, 7000);
        $("[data-test-id=agreement] .checkbox__box").click();
        $(".button__text").click();
        $(withText("Успешно!")).waitUntil(Condition.visible, 10000);
    }

}
