package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

import java.util.Locale;

public class ChildForm extends AbstractForm implements IFillable {
    private int index = 0;

    public ChildForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        SelenideElement snils = next();
        snils.$("input").clear();
        snils.$("input").setValue(properties.getProperty("child_snils"));

        SelenideElement child_surname = next();
        child_surname.$("input").clear();
        child_surname.$("input").setValue(properties.getProperty("child_surname"));

        SelenideElement child_name = next();
        child_name.$("input").clear();
        child_name.$("input").setValue(properties.getProperty("child_name"));

        SelenideElement child_middlename = next();
        child_middlename.$("input").clear();
        child_middlename.$("input").setValue(properties.getProperty("child_middlename"));

        selectSex();

        SelenideElement date_of_birth = next();
        date_of_birth.$("input").clear();
        date_of_birth.$("input").setValue(properties.getProperty("date_of_birth"));
    }

    private SelenideElement next() {
        try {
            while (!wrappers.get(index).isDisplayed()) {
                index++;
            }

            return wrappers.get(index);
        }
        finally {
            index++;
        }
    }

    private void selectSex() {
        SelenideElement sex = next();
        String name = sex.$("input").getAttribute("name");
        String value = "1";
        if (properties.getProperty("sex").toLowerCase(Locale.ROOT).trim().equals("женский")) {
            value = "2";
        }
        sex.$(By.name(name)).selectRadio(value);
    }

    @Override
    public String title() {
        return " Информация о ребёнке";
    }
}
