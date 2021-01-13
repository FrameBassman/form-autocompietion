package tech.romashov;

import org.slf4j.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private static final long serialVersionUID = 1L;

    public MainForm(Logger logger)
    {
        super("TestContentPane");
        this.setName("TestContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание панели с двумя кнопками
        JPanel contents = new JPanel();
        JLabel logLabel = new JLabel();
        JButton button = new JButton("Button");
        button.setName("TestButton");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logLabel.setText("Button was clicked");
                logLabel.setName("LogLabel");
                logger.info("Button was clicked");
            }
        });

        contents.add(button);
        contents.add(logLabel);

        // Замена панели содержимого
        setContentPane(contents);

        // Определение размера окна
        setSize(200, 100);
        // Открытие окна
        setVisible(true);
        setAlwaysOnTop(true);
    }
}
