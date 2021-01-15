package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

import java.util.ArrayList;
import java.util.List;

public class SummaryForm extends AbstractForm {
    private List<AbstractForm> forms;

    public SummaryForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        super(log, selenide, props);
        forms = new ArrayList<>();
        forms.add(new IssuerForm(log, selenide, props));
        forms.add(new IssuerPassportForm(log, selenide, props));
        forms.add(new IssuerAddressForm(log, selenide, props));
        forms.add(new NotificationForm(log, selenide, props));
        forms.add(new ChildForm(log, selenide, props));
        forms.add(new ChildPassportForm(log, selenide, props));
        forms.add(new ChildAddressForm(log, selenide, props));
        forms.add(new FatherForm(log, selenide, props));
        forms.add(new MotherForm(log, selenide, props));
    }

    public void fill() {
        log.info("Start form filling");
        selenide.$("#a_surname").clear();
        selenide.$("#a_surname").setValue(properties.getProperty("surname"));

        selenide.$("#a_name").clear();
        selenide.$("#a_name").setValue(properties.getProperty("name"));

        selenide.$("#a_middlename").clear();
        selenide.$("#a_middlename").setValue(properties.getProperty("middlename"));

        selenide.$("#a_snils").clear();
        selenide.$("#a_snils").setValue(properties.getProperty("snils"));

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
        log.info("Finish form filling");
    }
}
