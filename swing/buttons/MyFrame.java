package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;

public class MyFrame extends JFrame implements ActionListener {

    // declared as global
    JButton myButton;

    MyFrame() {

        ImageIcon icon = new ImageIcon("./thumbs_up.png");

        // Resize the image
        ImageIcon resizedIcon = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));

        myButton = new JButton("CLICK ME");
        // myButton.setText("CLICK ME");
        myButton.setFocusable(false);   // disable auto focus
        myButton.setBounds(200, 100, 150, 50);
        myButton.addActionListener(this);
        myButton.setIcon(resizedIcon);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(myButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton)
            System.out.println("POOOO");
    }
}
