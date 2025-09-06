import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
            
            if (name == null) {
                System.out.println("User canceled the name input.");
                break;
            }
            
            int confirmResult = JOptionPane.showConfirmDialog(null,"Do you want to proceed?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if (confirmResult == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                System.out.println("User chose not to confirm. Returning to name input.");
            }
        }
    }
}