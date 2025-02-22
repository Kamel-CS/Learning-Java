import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "Some Useless Info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Even More Useless Info", "title", JOptionPane.INFORMATION_MESSAGE);      // adds 'i' icon
        //JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);                        // adds '?' incon
        //JOptionPane.showMessageDialog(null, "Warning for you!", "title", JOptionPane.WARNING_MESSAGE);                // adds warning icon
        //JOptionPane.showMessageDialog(null, "Call Support", "title", JOptionPane.ERROR_MESSAGE);                 // adds red 'x' icon

        
        int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);   // yes/no - yes

        if (answer == 0) System.out.println("YES");
        else if (answer == 1) System.out.println("No");
        else if (answer == 2) System.out.println("Cancel");
        else if (answer == -1) System.out.println("Closed");


        String name = JOptionPane.showInputDialog("What is your name? ");
        System.out.println(name);


        // Combination of all
        String[] responses = {"No, you are awesome!", "Thanks Bro!", "BRUH"};
        JOptionPane.showOptionDialog(null, "You are awesome!", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    }
}
