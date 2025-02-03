package panels;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);

        ImageIcon image = new ImageIcon("./github_logo.png");
        JLabel label = new JLabel();
        label.setIcon(image);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // no layout manager
        frame.setSize(750,750);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
}
