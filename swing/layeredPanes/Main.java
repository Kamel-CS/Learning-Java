import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(650, 650);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLayeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 650, 650);

        // Define layers by name/depth
        String[] layerNames = { "DEFAULT_LAYER", "PALETTE_LAYER", "MODAL_LAYER", "POPUP_LAYER", "DRAG_LAYER" };
        int[] layerValues = { 0, 100, 200, 300, 400 };
        Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.MAGENTA };

        // Create labels
        for (int i = 0; i < 5; i++) {
            // add text to the top of each label
            JLabel label = new JLabel(layerNames[i] + " (" + layerValues[i] + ")", SwingConstants.CENTER);
            label.setOpaque(true);
            label.setBackground(colors[i]);
            label.setForeground(Color.BLACK);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setBounds(75 + (i * 75), 75 + (i * 75), 200, 200);

            // Set vertical alignment to top
            label.setVerticalAlignment(SwingConstants.TOP);
            
            layeredPane.add(label, Integer.valueOf(layerValues[i]));
        }

        frame.add(layeredPane);
        frame.setVisible(true);
    }
}
