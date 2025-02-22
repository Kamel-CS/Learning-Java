import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

    // Global
    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);         // Since the class is emplementing the ActionListener interface
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Cansolas", Font.BOLD, 35));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.RED);
        textField.setText("Hacker123");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            System.out.println("You Entered: " + textField.getText());;
            // disable button and text field after first submit
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }
}
