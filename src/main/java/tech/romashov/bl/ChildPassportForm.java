package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class ChildPassportForm extends AbstractForm implements IFillable {
    public ChildPassportForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        log.info("Start ChildPassportForm filling");
        SelenideElement child_passport_series = next();
        child_passport_series.$("input").clear();
        child_passport_series.$("input").setValue(properties.getProperty("child_passport_series"));

        SelenideElement child_passport_number = next();
        child_passport_number.$("input").clear();
        child_passport_number.$("input").setValue(properties.getProperty("child_passport_number"));

        SelenideElement child_passport_issue_date = next();
        child_passport_issue_date.$("input").clear();
        child_passport_issue_date.$("input").setValue(properties.getProperty("child_passport_issue_date"));

        SelenideElement child_passport_issuer = next();
        child_passport_issuer.$("input").clear();
        child_passport_issuer.$("input").setValue(properties.getProperty("child_passport_issuer"));

        SelenideElement child_passport_record_number = next();
        child_passport_record_number.$("input").clear();
        child_passport_record_number.$("input").setValue(properties.getProperty("child_passport_record_number"));
        log.info("Finish ChildPassportForm filling");
    }

    @Override
    public String title() {
        return " Свидетельство о рождении ребёнка";
    }
}
