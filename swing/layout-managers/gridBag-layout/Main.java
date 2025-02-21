import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Create the frame
        JFrame frame = new JFrame("Quadratic Equation Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding
        gbc.fill = GridBagConstraints.HORIZONTAL; // Make components stretch

        // Text fields
        JTextField aField = new JTextField(5);
        JTextField bField = new JTextField(5);
        JTextField cField = new JTextField(5);
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);

        JLabel aLabel = new JLabel("a:");
        JLabel bLabel = new JLabel("b:");
        JLabel cLabel = new JLabel("c:");
        JLabel resultLabel = new JLabel("Result:");
        JButton button = new JButton("Calculate");

        // Row 0: Label "a" and TextField
        gbc.gridx = 0; gbc.gridy = 0; panel.add(aLabel, gbc);
        gbc.gridx = 1; panel.add(aField, gbc);

        // Row 1: Label "b" and TextField
        gbc.gridx = 0; gbc.gridy = 1; panel.add(bLabel, gbc);
        gbc.gridx = 1; panel.add(bField, gbc);

        // Row 2: Label "c" and TextField
        gbc.gridx = 0; gbc.gridy = 2; panel.add(cLabel, gbc);
        gbc.gridx = 1; panel.add(cField, gbc);

        // Row 3: Label "Result" and result field (spans two columns)
        gbc.gridx = 0; gbc.gridy = 3; panel.add(resultLabel, gbc);
        gbc.gridx = 1; gbc.gridwidth = 2; panel.add(resultField, gbc);
        gbc.gridwidth = 1; // Reset width

        // Row 4: Button (spans two columns)
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        panel.add(button, gbc);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(aField.getText());
                    double b = Double.parseDouble(bField.getText());
                    double c = Double.parseDouble(cField.getText());
                    double discriminant = b * b - 4 * a * c;

                    if (discriminant < 0) {
                        resultField.setText("No Real Roots");
                    } else if (discriminant == 0) {
                        double root = -b / (2 * a);
                        resultField.setText("x = " + root);
                    } else {
                        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                        resultField.setText("x1 = " + root1 + ", x2 = " + root2);
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input! Enter numbers.");
                }
            }
        });

        // Add panel to frame
        frame.add(panel);
        frame.pack(); // Adjust size dynamically
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
