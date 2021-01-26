package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class FatherForm extends AbstractForm implements IFillable {
    public FatherForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        log.info("Start FatherForm filling");
        SelenideElement father_surname = next();
        father_surname.$("input").clear();
        father_surname.$("input").setValue(properties.getProperty("father_surname"));

        SelenideElement father_name = next();
        father_name.$("input").clear();
        father_name.$("input").setValue(properties.getProperty("father_name"));

        SelenideElement father_middlename = next();
        father_middlename.$("input").clear();
        father_middlename.$("input").setValue(properties.getProperty("father_middlename"));

        SelenideElement father_date_of_birth = next();
        father_date_of_birth.$("input").clear();
        father_date_of_birth.$("input").setValue(properties.getProperty("father_date_of_birth"));

        SelenideElement father_email = next();
        father_email.$("input").clear();
        father_email.$("input").setValue(properties.getProperty("father_email"));

        SelenideElement father_phone = next();
        father_phone.$("input").clear();
        father_phone.$("input").setValue(properties.getProperty("father_phone"));
        log.info("Finish FatherForm filling");
    }

    @Override
    public String title() {
        return " Отец ребёнка";
    }
}
