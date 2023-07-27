import javax.swing.*;
import java.awt.*;

public class ch11_GridLayout {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        // Parameters: (rows, columns, horizontalGap, verticalGap)

        // Add buttons to the gridPanel
        gridPanel.add(new JButton("Button 1"));
        gridPanel.add(new JButton("Button 2"));
        gridPanel.add(new JButton("Button 3"));
        gridPanel.add(new JButton("Button 4"));
        gridPanel.add(new JButton("Button 5"));
        gridPanel.add(new JButton("Button 6"));

        // Add the gridPanel to the frame's content pane
        frame.getContentPane().add(gridPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
