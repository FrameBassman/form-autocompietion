package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class Form {
    private Logger log;
    private SelenideDriver selenide;
    private ApplicationProperties properties;

    public Form(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        this.log = log;
        this.selenide = selenide;
        this.properties = props;
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
