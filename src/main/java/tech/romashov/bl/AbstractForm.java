package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public abstract class AbstractForm implements IFillable {
    protected Logger log;
    protected SelenideDriver selenide;
    protected ApplicationProperties properties;
    protected SelenideElement fieldSet;

    public AbstractForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection fieldSets) {
        this.log = log;
        this.selenide = selenide;
        this.properties = props;
        for (SelenideElement fieldSet : fieldSets) {
            if (fieldSet.getText().trim().startsWith(title().trim())) {
                this.fieldSet = fieldSet;
                break;
            }
        }
    }

    public SelenideElement fieldSet() {
        return null;
    }

    public abstract String title();
}
