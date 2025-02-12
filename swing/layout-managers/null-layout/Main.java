import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);  // Disable layout manager

        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 120, 40);  // (x, y, width, height)

        frame.add(button);
        frame.setVisible(true);
    }
}
