package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class MotherForm extends AbstractForm implements IFillable {
    public MotherForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        wrappers.get(0).$("input").clear();
        wrappers.get(0).$("input").setValue(properties.getProperty("mother_surname"));

        wrappers.get(1).$("input").clear();
        wrappers.get(1).$("input").setValue(properties.getProperty("mother_name"));

        wrappers.get(2).$("input").clear();
        wrappers.get(2).$("input").setValue(properties.getProperty("mother_middlename"));

        wrappers.get(3).$("input").clear();
        wrappers.get(3).$("input").setValue(properties.getProperty("mother_date_of_birth"));

        wrappers.get(4).$("input").clear();
        wrappers.get(4).$("input").setValue(properties.getProperty("mother_email"));

        wrappers.get(5).$("input").clear();
        wrappers.get(5).$("input").setValue(properties.getProperty("mother_phone"));
    }

    @Override
    public String title() {
        return " Мать ребёнка";
    }
}
