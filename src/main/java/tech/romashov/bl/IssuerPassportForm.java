package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerPassportForm extends AbstractForm implements IFillable {
    public IssuerPassportForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        wrappers.get(0).$("input").clear();
        wrappers.get(0).$("input").setValue(properties.getProperty("passport_series"));

        wrappers.get(1).$("input").clear();
        wrappers.get(1).$("input").setValue(properties.getProperty("passport_numeral"));

        wrappers.get(2).$("input").clear();
        wrappers.get(2).$("input").setValue(properties.getProperty("passport_issue_date"));

        wrappers.get(3).$("input").clear();
        wrappers.get(3).$("input").setValue(properties.getProperty("passport_issuer"));

        wrappers.get(4).$("input").clear();
        wrappers.get(4).$("input").setValue(properties.getProperty("passport_code"));
    }

    @Override
    public String title() {
        return " Паспортные данные заявителя";
    }
}
