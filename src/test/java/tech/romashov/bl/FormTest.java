package tech.romashov.bl;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

public class FormTest {
    @Test
    public void itWorks() throws Exception {
        SelenideDriver selenide = new SelenideDriver(new SelenideConfig());
        selenide.open("http://pgu.ivanovoobl.ru/record/in/?school=73802");
        selenide.switchTo().frame("main");
        boolean is = selenide.$("#myForm").isDisplayed();
        selenide.$("#myForm").$$(".fieldsets");
        // selenide.$("#myForm").$$(".fieldsets").get(0).$(By.xpath("legend")).toString()
        for (SelenideElement fieldSet : selenide.$("#myForm").$$(".fieldsets")) {

        }
        int a = 1;
    }
}
