package tech.romashov;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.slf4j.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.codeborne.selenide.Selenide.open;

public class MainForm extends JFrame {
    private static final long serialVersionUID = 1L;

    public MainForm(Logger logger)
    {
        super("TestContentPane");

        SelenideConfig config = new SelenideConfig();
        SelenideDriver selenide = new SelenideDriver(config);

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
                selenide.$("#a_surname").setValue("Пупкин");
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
