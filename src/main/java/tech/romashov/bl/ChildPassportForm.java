package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class ChildPassportForm extends AbstractForm {
    public ChildPassportForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
    }

    @Override
    public void fill() {

    }

    @Override
    public String title() {
        return " Свидетельство о рождении ребёнка";
    }
}
