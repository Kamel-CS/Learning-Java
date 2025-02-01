import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    
    public static void main(String[] args) {

        JLabel label = new JLabel("Bro, do you even code?");    // or do it on a seperate line

        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.add(label);
    }
}
