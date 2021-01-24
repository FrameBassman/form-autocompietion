package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class NotificationForm extends AbstractForm implements IFillable {
    public NotificationForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        wrappers.get(0).$("input").clear();
        wrappers.get(0).$("input").setValue(properties.getProperty("by_phone"));

        wrappers.get(1).$("input").clear();
        wrappers.get(1).$("input").setValue(properties.getProperty("by_email"));
    }


    @Override
    public String title() {
        return " О принятом решении, связанном с постановкой на учет в общеобразовательное учреждение, прошу уведомлять меня";
    }
}
