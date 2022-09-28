package net.braniumacademy.exercises;

import javax.swing.*;
import java.awt.*;

public class Exercises3 extends JFrame {
    public Exercises3(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        var g2d = (Graphics2D) g; // ép kiểu sang Graphics2D
        g2d.setStroke(new BasicStroke(2)); // gọi thiết lập độ rộng nét vẽ
        drawLine(g, 8, 200, 200, 32);
        drawLine(g, 200, 32, 392, 200);
        drawLine(g, 392, 200, 200, 412);
        drawLine(g, 200, 412, 8, 200);
        drawLine(g, 8, 200, 392, 200);
        drawLine(g, 200, 32, 200, 412);
    }

    private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.blue);
        g.drawLine(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        int width = 400; // chiều rộng cửa sổ
        int height = 420; // chiều cao cửa sổ
        String title = "My First JFrame Application";
        Exercises3 frame = new Exercises3(title, width, height);
        frame.setVisible(true);
    }
}

