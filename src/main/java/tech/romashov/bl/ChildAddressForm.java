package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class ChildAddressForm extends AbstractForm implements IFillable {
    public ChildAddressForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        wrappers.get(0).$("input").clear();
        wrappers.get(0).$("input").setValue(properties.getProperty("child_index"));

        wrappers.get(1).$("input").clear();
        wrappers.get(1).$("input").setValue(properties.getProperty("child_city"));

        wrappers.get(2).$("input").clear();
        wrappers.get(2).$("input").setValue(properties.getProperty("child_street"));

        wrappers.get(3).$("input").clear();
        wrappers.get(3).$("input").setValue(properties.getProperty("child_house_number"));

        wrappers.get(4).$("input").clear();
        wrappers.get(4).$("input").setValue(properties.getProperty("child_building"));

        wrappers.get(5).$("input").clear();
        wrappers.get(5).$("input").setValue(properties.getProperty("child_apartment"));
    }

    @Override
    public String title() {
        return " Адрес ребёнка";
    }
}
