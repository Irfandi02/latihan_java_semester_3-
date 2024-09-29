
package com.mycompany.mavenproject8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingText extends JFrame {

    private int textX = 50;
    private int textY = 50;

    public MovingText() {
        setTitle("Moving Text");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveText();
                repaint();
            }
        });
        timer.start();
    }

    private void moveText() {
        textX += 5;
        if (textX > getWidth()) {
            textX = 0;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Irfandi", textX, textY);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MovingText movingText = new MovingText();
                movingText.setVisible(true);
            }
        });
    }
}
