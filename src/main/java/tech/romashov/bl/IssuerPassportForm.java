package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerPassportForm extends AbstractForm implements IFillable {
    public IssuerPassportForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        SelenideElement passport_series = next();
        passport_series.$("input").clear();
        passport_series.$("input").setValue(properties.getProperty("passport_series"));

        SelenideElement passport_numeral = next();
        passport_numeral.$("input").clear();
        passport_numeral.$("input").setValue(properties.getProperty("passport_numeral"));

        SelenideElement passport_issue_date = next();
        passport_issue_date.$("input").clear();
        passport_issue_date.$("input").setValue(properties.getProperty("passport_issue_date"));

        SelenideElement passport_issuer = next();
        passport_issuer.$("input").clear();
        passport_issuer.$("input").setValue(properties.getProperty("passport_issuer"));

        SelenideElement passport_code = next();
        passport_code.$("input").clear();
        passport_code.$("input").setValue(properties.getProperty("passport_code"));
    }

    @Override
    public String title() {
        return " Паспортные данные заявителя";
    }
}
