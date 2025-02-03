package labels;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class Main {
    
    public static void main(String[] args) {
        

        JLabel label = new JLabel();

        ImageIcon icon = new ImageIcon("./Bro_thinks_he's_hacker.png");
        icon.setImage(icon.getImage().getScaledInstance(250, 250, 0));  // resize the image

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);  // create a border
        // this demonstrates that labels takes the full size of the frame

        label.setText("Hello, World!");
        label.setIcon(icon);

        label.setHorizontalTextPosition(JLabel.CENTER);         // set Text LEFT (default), CENTER, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);              // set Text TOP, CENTER (default), BOTTOM of ImageIcon
        label.setIconTextGap(20);                               // gap between icon and text
        
        label.setForeground(new Color(0, 255, 0));               // change text color
        label.setFont(new Font("Iosevka", Font.ITALIC, 20));    // change font style, size

        label.setBackground(Color.BLACK);            // change background color of the label (hex, rgb, Color.colorname)
        label.setOpaque(true);                       // set to true to see the background color

        label.setBorder(border);                     // set the border
        
        // Set position of label withing the frame
        label.setHorizontalAlignment(JLabel.CENTER);     // TOP, CENTER , BOTTOM (also relative to text)
        label.setVerticalAlignment(JLabel.CENTER);       // LEFT, CENTER, RIGHT (also relative to text)
        
        JFrame frame = new JFrame();
        frame.setTitle("My First GUI");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.add(label);
        frame.pack();  // resize the frame to fit the components
    }
}
