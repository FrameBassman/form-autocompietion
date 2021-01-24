package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class FatherForm extends AbstractForm {
    public FatherForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
    }

    @Override
    public void fill() {

    }

    @Override
    public String title() {
        return " Отец ребёнка";
    }
}
