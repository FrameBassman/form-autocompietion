package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

public class ChildForm extends AbstractForm implements IFillable {
    public ChildForm(Logger log, SelenideDriver selenide, ApplicationProperties props, ElementsCollection elements) {
        super(log, selenide, props, elements);
    }

    @Override
    public void fill() {
        wrappers.get(0).$("input").clear();
        wrappers.get(0).$("input").setValue(properties.getProperty("child_snils"));

        wrappers.get(1).$("input").clear();
        wrappers.get(1).$("input").setValue(properties.getProperty("child_surname"));

        wrappers.get(2).$("input").clear();
        wrappers.get(2).$("input").setValue(properties.getProperty("child_name"));

        wrappers.get(3).$("input").clear();
        wrappers.get(3).$("input").setValue(properties.getProperty("child_middlename"));

//        wrappers.get(4).$("input").clear();
//        wrappers.get(4).$("input").setValue(properties.getProperty("building"));

        wrappers.get(5).$("input").clear();
        wrappers.get(5).$("input").setValue(properties.getProperty("date_of_birth"));
    }

    @Override
    public String title() {
        return " Информация о ребёнке";
    }
}
