import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

class MyFrame extends JFrame {
    MyFrame() {

        this.setTitle("Java Swing GUI"); 
        this.setSize(800, 600);

        this.setLocationRelativeTo(null);  // Center the frame on the screen
        //this.setLocation(100, 100);  // Set the frame to appear at (x=100, y=100)

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // close the application when the frame is closed
        // by default it is set to HIDE_ON_CLOSE which hides the frame but the application is still running
        
        this.setResizable(false);  // true by default
        this.setVisible(true);     // required to display the frame

        ImageIcon icon = new ImageIcon("./github_logo.png");
        this.setIconImage(icon.getImage());    // change frame's icon

        this.getContentPane().setBackground(new Color(0x123456));  // change background color of the frame (hex, rgb, Color.colorname)
    }
}
