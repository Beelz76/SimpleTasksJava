/*Создать интерфейс по изображению (использовать разные виды компоновок, если одинаковыхобъектов больше 3, то использовать массив)*/

import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Панель для меток и слайдера
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 5));
        JLabel label1 = new JLabel("Метка 1");
        JSlider slider = new JSlider();
        JLabel label2 = new JLabel("Метка 2");
        topPanel.add(label1);
        topPanel.add(slider);
        topPanel.add(label2);

        //Панель для текстового поля
        JPanel middlePanel = new JPanel(new BorderLayout());
        JTextField textField = new JTextField("Текстовое поле");

        middlePanel.add(textField);
        //Панель для кнопок
        JPanel buttonPanel = new JPanel(new GridLayout(4, 5, 10, 10));
        buttonPanel.setPreferredSize(new Dimension(400, 300));
        JButton[] buttons = new JButton[13];
        String[] buttonLabels = {"1", "2", "3", "+", "4", "5", "6", "-", "7","8", "9", "=", "0"};

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);
            if (i == 2 || i == 6 || i == 10 || i == 11) {
                buttonPanel.add(new JLabel(""));
            }
        }

        //Добавление панелей
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}