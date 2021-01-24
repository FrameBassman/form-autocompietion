package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerAddressForm extends AbstractForm implements IFillable {
    public IssuerAddressForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        wrappers.get(0).$("input").clear();
        wrappers.get(0).$("input").setValue(properties.getProperty("index"));

        wrappers.get(1).$("input").clear();
        wrappers.get(1).$("input").setValue(properties.getProperty("city"));

        wrappers.get(2).$("input").clear();
        wrappers.get(2).$("input").setValue(properties.getProperty("street"));

        wrappers.get(3).$("input").clear();
        wrappers.get(3).$("input").setValue(properties.getProperty("house_number"));

        wrappers.get(4).$("input").clear();
        wrappers.get(4).$("input").setValue(properties.getProperty("building"));

        wrappers.get(5).$("input").clear();
        wrappers.get(5).$("input").setValue(properties.getProperty("apartment"));
    }

    @Override
    public String title() {
        return " Адрес заявителя";
    }
}
