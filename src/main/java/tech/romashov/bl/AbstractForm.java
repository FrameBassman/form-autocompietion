package tech.romashov.bl;

import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public abstract class AbstractForm {
    protected Logger log;
    protected SelenideDriver selenide;
    protected ApplicationProperties properties;

    public AbstractForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        this.log = log;
        this.selenide = selenide;
        this.properties = props;
    }

    public abstract void fill();
}
