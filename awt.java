import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt extends JFrame {
    public awt() {
        setTitle("Personal Details");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel to hold the button
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        // Create a button
        JButton displayButton = new JButton("Display Personal Details");
        panel.add(displayButton);

        // Add an action listener to the button
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Define your personal details
                String name = "John Doe";
                int age = 30;
                String address = "123 Main Street";
                String email = "john.doe@example.com";

                // Display the personal details in a dialog box
                JOptionPane.showMessageDialog(null,
                        "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Address: " + address + "\n" +
                        "Email: " + email,
                        "Personal Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                awt frame = new awt();
                frame.setVisible(true);
            }
        });
    }
}
