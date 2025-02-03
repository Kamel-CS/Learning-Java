package buttons;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener {


    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("./pixel_start.png");
        ImageIcon icon2 = new ImageIcon("./pixel_cat.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 200, 200);     // same layout manager as its parent container
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 200, 130);     // same layout manager as its parent container
        button.setText("CLICK ME");
        button.setIcon(icon);
        button.setFocusable(false);     // remove the border from the Text

        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setIconTextGap(-5);                               // gap between icon and text

        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createDashedBorder(Color.black));

        button.addActionListener(this);         // for the button to work


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);   // no layout manager
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);   // center

        this.add(button);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // System.out.println("POO");    // displays on the terminal
            // button.setEnabled(false);    // disable the button after one click
            label.setVisible(true);
        }
    }
}
