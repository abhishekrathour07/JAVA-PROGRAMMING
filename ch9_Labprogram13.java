import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch9_Labprogram13 {
    public static void main(String[] args) {
        // Create a JFrame object (window)
        JFrame frame = new JFrame("Message Window");

        // Create a JLabel object (message)
        JLabel label = new JLabel("Hello, World!");

        // Add the label to the frame
        frame.getContentPane().add(label);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the behavior of the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}


