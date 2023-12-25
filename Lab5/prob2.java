import javax.swing.*;
import java.awt.*;

public class prob2 extends JFrame {

    public prob2() {
        setTitle("Simple Rectangle");
        setSize(300, 200); // Set the window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw the rectangle at position (x, y) with width and height
        int x = 50;
        int y = 50;
        int rectWidth = 200;
        int rectHeight = 100;
        g.fillRect(x, y, rectWidth, rectHeight);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            prob2 simpleRect = new prob2();
            simpleRect.setVisible(true);
        });
    }
}
