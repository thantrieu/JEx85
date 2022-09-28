package net.braniumacademy.exercises;

import javax.swing.*;
import java.awt.*;

public class Exercises4 extends JFrame {
    public Exercises4(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        var g2d = (Graphics2D) g; // ép kiểu sang Graphics2D
        g2d.setStroke(new BasicStroke(2)); // gọi thiết lập độ rộng nét vẽ
        drawLine(g, 58, 58, 442, 58);
        drawLine(g, 58, 342, 442, 342);
        drawLine(g, 58, 58, 58, 342);
        drawLine(g, 442, 58, 442, 342);
        drawLine(g, 58, 58, 258, 208);
        drawLine(g, 442, 58, 258, 208);
    }

    private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.blue);
        g.drawLine(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        int width = 500; // chiều rộng cửa sổ
        int height = 420; // chiều cao cửa sổ
        String title = "My First JFrame Application";
        Exercises4 frame = new Exercises4(title, width, height);
        frame.setVisible(true);
    }
}
