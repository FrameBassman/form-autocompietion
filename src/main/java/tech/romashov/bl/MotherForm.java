package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class MotherForm extends AbstractForm implements IFillable {
    public MotherForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        SelenideElement mother_surname = next();
        mother_surname.$("input").clear();
        mother_surname.$("input").setValue(properties.getProperty("mother_surname"));

        SelenideElement mother_name = next();
        mother_name.$("input").clear();
        mother_name.$("input").setValue(properties.getProperty("mother_name"));

        SelenideElement mother_middlename = next();
        mother_middlename.$("input").clear();
        mother_middlename.$("input").setValue(properties.getProperty("mother_middlename"));

        SelenideElement mother_date_of_birth = next();
        mother_date_of_birth.$("input").clear();
        mother_date_of_birth.$("input").setValue(properties.getProperty("mother_date_of_birth"));

        SelenideElement mother_email = next();
        mother_email.$("input").clear();
        mother_email.$("input").setValue(properties.getProperty("mother_email"));

        SelenideElement mother_phone = next();
        mother_phone.$("input").clear();
        mother_phone.$("input").setValue(properties.getProperty("mother_phone"));
    }

    @Override
    public String title() {
        return " Мать ребёнка";
    }
}
