package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerForm extends AbstractForm implements IFillable {
    public IssuerForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        SelenideElement surname = next();
        surname.$("input").clear();
        surname.$("input").setValue(properties.getProperty("surname"));

        SelenideElement name = next();
        name.$("input").clear();
        name.$("input").setValue(properties.getProperty("name"));

        SelenideElement middlename = next();
        middlename.$("input").clear();
        middlename.$("input").setValue(properties.getProperty("middlename"));

        SelenideElement snils = next();
        snils.$("input").clear();
        snils.$("input").setValue(properties.getProperty("snils"));
    }

    @Override
    public String title() {
        return " Заявитель";
    }
}
