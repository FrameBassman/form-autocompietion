package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerPassportForm extends AbstractForm {
    public IssuerPassportForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
    }
}
