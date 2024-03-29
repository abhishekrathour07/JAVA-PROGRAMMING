import java.awt.*;
import java.awt.event.*;

public class practice {
    public static void main(String[] args) {
        // Create the main frame
        Frame frame = new Frame("BorderLayout Example");
        
        // Create components
        Button button1 = new Button("North");
        Button button2 = new Button("South");
        Button button3 = new Button("East");
        Button button4 = new Button("West");
        Button button5 = new Button("Center");
        
        // Set the layout manager for the frame
        frame.setLayout(new BorderLayout());
        
        // Add components to the frame with specified regions
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);
        
        // Create the exit button
        Button exitButton = new Button("Exit");
        
        // Add action listener to handle the exit button click
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the frame and exit the application
                frame.dispose();
                System.exit(0);
            }
        });
        
        // Add the exit button to the South region
        frame.add(exitButton, BorderLayout.SOUTH);
        
        // Set the frame size and make it visible
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
