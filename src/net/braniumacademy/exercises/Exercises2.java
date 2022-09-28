package net.braniumacademy.exercises;

import javax.swing.*;
import java.awt.*;

public class Exercises2 extends JFrame {
    private final int width; // chiều rộng Ox
    private final int height; // chiều cao Oy

    public Exercises2(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        var g2d = (Graphics2D) g; // ép kiểu sang Graphics2D
        g2d.setStroke(new BasicStroke(2)); // gọi thiết lập độ rộng nét vẽ
        int radius = 150;
        Color color = Color.red;
        drawCircle(g, radius, color); // vẽ đường tròn sau
        drawRoundRect(g, 100, Color.blue); // vẽ hình vuông bo cạnh trước
        drawCircle(g, radius/2, Color.yellow);
    }

    /**
     * Phương thức vẽ đường tròn bán kính radius với màu được chỉ định
     * @param g một đối tượng kiểu Graphics hoặc Graphics2D
     */
    private void drawCircle(Graphics g, int radius, Color color) {
        g.setColor(color);
        g.fillOval(width / 2 - radius, height / 2 - radius,
                2 * radius, 2 * radius);
    }

    /**
     * Phương thức vẽ hình vuông/chữ nhật bo cạnh với màu cho trước.
     * @param g một đối tượng kiểu Graphics hoặc Graphics2D
     */
    private void drawRoundRect(Graphics g, int width, Color color) {
        g.setColor(color); // set màu cho hình chữ nhật
        g.fillRoundRect(this.width / 2 - width, this.height / 2 - width,
                2 * width, 2 * width, 20, 20);
    }

    public static void main(String[] args) {
        int width = 400; // chiều rộng cửa sổ
        int height = 400; // chiều cao cửa sổ
        String title = "My First JFrame Application";
        Exercises2 frame = new Exercises2(title, width, height);
        frame.setVisible(true);
    }
}

