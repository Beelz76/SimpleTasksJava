/*Нарисовать свою фамилию линиями разной толщины, цвета и стиля (и вообще – проявить фантазию)*/

import java.awt.*;
import javax.swing.*;

class DrawingSurname extends JFrame {
    public DrawingSurname() {
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Виды линий
        BasicStroke firstStroke = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        BasicStroke secondStroke = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        BasicStroke thirdStroke = new BasicStroke(8, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        // Установка цветов линий
        g.setColor(Color.RED);

        //Буква П
        g.setStroke(firstStroke);
        g.drawArc(50, 50, 50, 200, 0, 180);

        //Буква Е
        g.setColor(Color.BLUE);
        g.setStroke(firstStroke);
        g.drawLine(120, 50, 120, 150);
        g.setStroke(secondStroke);
        g.drawLine(120, 50, 180, 50);
        g.setStroke(firstStroke);
        g.drawLine(120, 100, 160, 100);
        g.setStroke(thirdStroke);
        g.drawLine(120, 150, 180, 150);

        //Буква Т
        g.setColor(Color.RED);
        g.setStroke(firstStroke);
        g.drawLine(200, 50, 240, 50);
        g.setStroke(thirdStroke);
        g.drawLine(220, 50, 220, 150);

        //Буква Р
        g.setStroke(secondStroke);
        g.drawLine(260, 50, 260, 150);
        g.setColor(Color.BLUE);
        g.drawOval(260, 50, 50, 50);

        //Буква О
        g.setStroke(firstStroke);
        g.drawArc(320, 50, 80, 100, 0, 360);

        //Буква В
        g.setColor(Color.RED);
        g.drawLine(420, 50, 420, 150);
        g.setStroke(secondStroke);
        g.drawLine(420, 50, 460, 50);
        g.drawLine(420, 100, 460, 100);
        g.drawLine(420, 150, 460, 150);
        g.drawLine(460, 50, 460, 150);
    }
}

public class Main {
    public static void main(String[] args) {
        new DrawingSurname();
    }
}