package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

import static com.codeborne.selenide.Selectors.byText;

public class CheckboxesForm extends AbstractForm implements IFillable {
    public CheckboxesForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection fieldSets) {
        super(log, selenide, props, fieldSets);
    }

    @Override
    public String title() {
        return "";
    }

    @Override
    public void fill() {
        log.info("Start checkboxes filling");
        if (Boolean.parseBoolean(properties.getProperty("is_brother_or_sister_study"))) {
            selenide.$(byText("Учится брат/сестра")).parent().parent()
                    .$("input").click();
        }

        selenide.$(byText("Согласие на обработку персональных данных")).parent().parent()
                .$("input").click();

        selenide.$(byText("Подтверждение")).parent().parent()
                .$("input").click();
        log.info("Finish checkboxes filling");
    }
}
