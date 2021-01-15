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

    @Override
    public void fill() {
        log.info("Start form filling");
        for (AbstractForm form : forms) {
            form.fill();
        }
        log.info("Finish form filling");
    }
}
