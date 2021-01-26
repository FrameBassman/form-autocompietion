package tech.romashov.bl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;
import tech.romashov.ApplicationProperties;

import java.util.ArrayList;
import java.util.List;

public class SummaryForm implements IFillable {
    private Logger log;
    private List<AbstractForm> forms;

    public SummaryForm(Logger log, SelenideDriver selenide, ApplicationProperties props) {
        this.log = log;
        forms = new ArrayList<>();
        ElementsCollection elements = selenide.$$(".fieldsets");
        forms.add(new IssuerForm(log, selenide, props, elements));
        forms.add(new IssuerPassportForm(log, selenide, props, elements));
        forms.add(new IssuerAddressForm(log, selenide, props, elements));
        forms.add(new NotificationForm(log, selenide, props, elements));
        forms.add(new ChildForm(log, selenide, props, elements));
        forms.add(new ChildPassportForm(log, selenide, props, elements));
        forms.add(new ChildAddressForm(log, selenide, props, elements));
        forms.add(new FatherForm(log, selenide, props, elements));
        forms.add(new MotherForm(log, selenide, props, elements));
        forms.add(new CheckboxesForm(log, selenide, props, elements));
    }

    @Override
    public void fill() {
        log.info("Start form filling");
        for (AbstractForm form : forms) {
            form.fill();
        }
        log.info("Finish form filling");
    }
}
