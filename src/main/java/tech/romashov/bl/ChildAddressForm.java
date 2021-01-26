package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class ChildAddressForm extends AbstractForm implements IFillable {
    public ChildAddressForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        log.info("Start ChildAddressForm filling");
        SelenideElement child_index = next();
        child_index.$("input").clear();
        child_index.$("input").setValue(properties.getProperty("child_index"));

        SelenideElement child_city = next();
        child_city.$("input").clear();
        child_city.$("input").setValue(properties.getProperty("child_city"));

        SelenideElement child_street = next();
        child_street.$("input").clear();
        child_street.$("input").setValue(properties.getProperty("child_street"));

        SelenideElement child_house_number = next();
        child_house_number.$("input").clear();
        child_house_number.$("input").setValue(properties.getProperty("child_house_number"));

        SelenideElement child_building = next();
        child_building.$("input").clear();
        child_building.$("input").setValue(properties.getProperty("child_building"));

        SelenideElement child_apartment = next();
        child_apartment.$("input").clear();
        child_apartment.$("input").setValue(properties.getProperty("child_apartment"));
        log.info("Finish ChildAddressForm filling");
    }

    @Override
    public String title() {
        return " Адрес ребёнка";
    }
}
