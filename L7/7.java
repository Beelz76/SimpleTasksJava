/*К созданному интерфейсу из предыдущих работ добавить функциональность – как минимум 3 различных слушателя*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Панель для меток и слайдера
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 5));
        JSlider slider = new JSlider();
        JLabel label1 = new JLabel("Значение: " + String.valueOf(slider.getValue()));
        JLabel label2 = new JLabel("Ничего");

        topPanel.add(label1);
        topPanel.add(slider);
        topPanel.add(label2);

        //Панель для текстового поля
        JPanel middlePanel = new JPanel(new BorderLayout());
        JTextField textField = new JTextField();
        middlePanel.add(textField);
        //Панель для кнопок
        JPanel buttonPanel = new JPanel(new GridLayout(4, 5, 10, 10));
        buttonPanel.setPreferredSize(new Dimension(400, 300));
        JButton[] buttons = new JButton[13];
        String[] buttonLabels = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "=", "0"};
        
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
        //Добавление слушателей

        //Вывод значения слайдера
        slider.addChangeListener(e -> {
            int currentValue = slider.getValue();
            label1.setText("Значение: " + String.valueOf(currentValue));
        });

        //Вывод значения текстового поля
        textField.addActionListener(e -> {
            String text = textField.getText();
            JOptionPane.showMessageDialog(frame, "Введенный текст: " + text);
        });

        for (int i = 0; i < buttons.length; i++) {
            int index = i;
            //Вывод кнопки, на которую наведен курсор
            buttons[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    label2.setText("Кнопка " + buttonLabels[index]);
                }
            });
            //Вывод значения при арифметических операциях (как калькулятор)
            if (i == 3 || i == 7 || i == 11) {
                buttons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = ((JButton) e.getSource()).getText();
                        String currentText = textField.getText();
                        if (buttonText.equals("=")) {
                            String[] parts = currentText.split(" ");
                            int firstValue = Integer.parseInt(parts[0]);
                            int secondValue = Integer.parseInt(parts[2]);
                            String operator = parts[1];
                            int result = 0;
                            switch (operator) {
                            case "+":
                                result = firstValue + secondValue;
                                break;
                            case "-":
                                result = firstValue - secondValue;
                                break;
                            }
                            textField.setText(Integer.toString(result));
                            JOptionPane.showMessageDialog(frame, firstValue + " " + operator + " " +
                                secondValue + " = " + result);
                        } else {
                            textField.setText(currentText + " " + buttonText + " ");
                        }
                    }
                });
            } else {
                buttons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = ((JButton) e.getSource()).getText();
                        String currentText = textField.getText();
                        textField.setText(currentText + buttonText);
                    }
                });
            }
            frame.pack();
            frame.setVisible(true);
        }
    }
}
