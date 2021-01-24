package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class IssuerPassportForm extends AbstractForm {
    public IssuerPassportForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
    }

    @Override
    public void fill() {
        selenide.$("#a_p_series").clear();
        selenide.$("#a_p_series").setValue(properties.getProperty("passport_series"));

        selenide.$("#a_p_numeral").clear();
        selenide.$("#a_p_numeral").setValue(properties.getProperty("passport_numeral"));

        selenide.$("#a_p_issue_date").clear();
        selenide.$("#a_p_issue_date").setValue(properties.getProperty("passport_issue_date"));

        selenide.$("#a_p_issuer").clear();
        selenide.$("#a_p_issuer").setValue(properties.getProperty("passport_issuer"));

        selenide.$("#a_p_code").clear();
        selenide.$("#a_p_code").setValue(properties.getProperty("passport_code"));
    }

    @Override
    public String title() {
        return " Паспортные данные заявителя";
    }
}
