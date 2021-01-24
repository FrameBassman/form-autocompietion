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

    }


    @Override
    public String title() {
        return " О принятом решении, связанном с постановкой на учет в общеобразовательное учреждение, прошу уведомлять меня";
    }
}
