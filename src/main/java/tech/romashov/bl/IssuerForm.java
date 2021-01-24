package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerForm extends AbstractForm {
    public IssuerForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
    }

    @Override
    public void fill() {
        selenide.$("#a_surname").clear();
        selenide.$("#a_surname").setValue(properties.getProperty("surname"));

        selenide.$("#a_name").clear();
        selenide.$("#a_name").setValue(properties.getProperty("name"));

        selenide.$("#a_middlename").clear();
        selenide.$("#a_middlename").setValue(properties.getProperty("middlename"));

        selenide.$("#a_snils").clear();
        selenide.$("#a_snils").setValue(properties.getProperty("snils"));
    }

    @Override
    public String title() {
        return " Заявитель";
    }
}
