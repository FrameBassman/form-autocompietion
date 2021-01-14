package tech.romashov;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private static final long serialVersionUID = 1L;

    public MainForm(Logger logger)
    {
        super("TestContentPane");

        SelenideConfig config = new SelenideConfig();
        SelenideDriver selenide = new SelenideDriver(config);

        ApplicationProperties properties = new ApplicationProperties(logger);

        this.setName("TestContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание панели с двумя кнопками
        JPanel contents = new JPanel();
        JButton openBrowserButton = new JButton("Открываем браузер");
        openBrowserButton.setName("OpenBrowserButton");
        openBrowserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("Start browser opening");
                selenide.open("http://pgu.ivanovoobl.ru/record/in/?school=73802");
                selenide.switchTo().frame("main");
                logger.info("Finish browser opening");
            }
        });
        JButton fillFormButton = new JButton("Заполняем форму");
        fillFormButton.setName("OpenBrowserButton");
        fillFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("Start form filling");
                selenide.$("#a_surname").clear();
                selenide.$("#a_surname").setValue(properties.getProperty("surname"));

                selenide.$("#a_name").clear();
                selenide.$("#a_name").setValue(properties.getProperty("name"));

                selenide.$("#a_middlename").clear();
                selenide.$("#a_middlename").setValue(properties.getProperty("middlename"));

                selenide.$("#a_snils").clear();
                selenide.$("#a_snils").setValue(properties.getProperty("snils"));

                selenide.$("#a_p_series").clear();
                selenide.$("#a_p_series").setValue(properties.getProperty("passport_series"));

                selenide.$("#a_p_numeral").clear();
                selenide.$("#a_p_numeral").setValue(properties.getProperty("passport_numeral"));

                selenide.$("#a_p_issue_date").clear();
                selenide.$("#a_p_issue_date").setValue(properties.getProperty("passport_issue_date"));

                selenide.$("#a_p_issuer").clear();
                selenide.$("#a_p_issuer").setValue(properties.getProperty("passport_issuer"));

                selenide.$("#a_p_code").clear();
                selenide.$("#a_p_code").setValue(properties.getProperty("passport_code"));
                logger.info("Finish form filling");
            }
        });

        contents.add(openBrowserButton);
        contents.add(fillFormButton);
        setContentPane(contents);
        setSize(200, 100);
        // Открытие окна
        setVisible(true);
        setAlwaysOnTop(true);
    }
}
