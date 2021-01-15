package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerAddressForm extends AbstractForm {
    public IssuerAddressForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
    }
}
