package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class ChildPassportForm extends AbstractForm implements IFillable {
    public ChildPassportForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        wrappers.get(0).$("input").clear();
        wrappers.get(0).$("input").setValue(properties.getProperty("child_passport_series"));

        wrappers.get(1).$("input").clear();
        wrappers.get(1).$("input").setValue(properties.getProperty("child_passport_number"));

        wrappers.get(2).$("input").clear();
        wrappers.get(2).$("input").setValue(properties.getProperty("child_passport_issue_date"));

        wrappers.get(3).$("input").clear();
        wrappers.get(3).$("input").setValue(properties.getProperty("child_passport_issuer"));

        wrappers.get(4).$("input").clear();
        wrappers.get(4).$("input").setValue(properties.getProperty("child_passport_record_number"));
    }

    @Override
    public String title() {
        return " Свидетельство о рождении ребёнка";
    }
}
