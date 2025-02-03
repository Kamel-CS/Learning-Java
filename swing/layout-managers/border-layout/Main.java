import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("MY GUI APP");
        // frame.setLayout(new BorderLayout());        not necessary since it's the default
        frame.setLayout(new BorderLayout(10, 10));      // (width, height) margins
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        // ----------------- sub panels -----------------------
        
        JPanel subPanel1 = new JPanel();
        JPanel subPanel2 = new JPanel();
        JPanel subPanel3 = new JPanel();
        JPanel subPanel4 = new JPanel();
        JPanel subPanel5 = new JPanel();

        subPanel1.setBackground(Color.gray);
        subPanel2.setBackground(Color.cyan);
        subPanel3.setBackground(Color.orange);
        subPanel4.setBackground(Color.pink);
        subPanel5.setBackground(new Color(0x123456));

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        // ads sub panels to panel 5
        panel5.setLayout(new BorderLayout());       // change the default Layout manager
        
        panel5.add(subPanel1, BorderLayout.NORTH);
        panel5.add(subPanel2, BorderLayout.WEST);
        panel5.add(subPanel3, BorderLayout.EAST);
        panel5.add(subPanel4, BorderLayout.SOUTH);
        panel5.add(subPanel5, BorderLayout.CENTER);

        // ------------------------------------------------
        
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        frame.setVisible(true);
    } 
}
