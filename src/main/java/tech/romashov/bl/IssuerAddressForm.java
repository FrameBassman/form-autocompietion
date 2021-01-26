package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerAddressForm extends AbstractForm implements IFillable {
    public IssuerAddressForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        SelenideElement indexElement = next();
        indexElement.$("input").clear();
        indexElement.$("input").setValue(properties.getProperty("index"));

        SelenideElement city = next();
        city.$("input").clear();
        city.$("input").setValue(properties.getProperty("city"));

        SelenideElement street = next();
        street.$("input").clear();
        street.$("input").setValue(properties.getProperty("street"));

        SelenideElement house_number = next();
        house_number.$("input").clear();
        house_number.$("input").setValue(properties.getProperty("house_number"));

        SelenideElement building = next();
        building.$("input").clear();
        building.$("input").setValue(properties.getProperty("building"));

        SelenideElement apartment = next();
        apartment.$("input").clear();
        apartment.$("input").setValue(properties.getProperty("apartment"));
    }

    @Override
    public String title() {
        return " Адрес заявителя";
    }
}
