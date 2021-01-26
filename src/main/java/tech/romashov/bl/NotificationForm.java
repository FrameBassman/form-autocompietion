package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class NotificationForm extends AbstractForm implements IFillable {
    public NotificationForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        SelenideElement by_phone = next();
        by_phone.$("input").clear();
        by_phone.$("input").setValue(properties.getProperty("by_phone"));

        SelenideElement by_email = next();
        by_email.$("input").clear();
        by_email.$("input").setValue(properties.getProperty("by_email"));
    }


    @Override
    public String title() {
        return " О принятом решении, связанном с постановкой на учет в общеобразовательное учреждение, прошу уведомлять меня";
    }
}
