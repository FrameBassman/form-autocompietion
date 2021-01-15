package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerForm extends AbstractForm {
    public IssuerForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
    }
}
