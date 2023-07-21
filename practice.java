import java.awt.*;
import java.awt.event.*;

public class practice extends Frame {
    private PopupMenu popupMenu;

    public practice() {
        // Set up the main Frame properties
        setTitle("Popup Menu Example");
        setSize(300, 200);

        // Create a PopupMenu
        popupMenu = new PopupMenu("Options");

        // Create menu items for the PopupMenu
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        // Add menu items to the PopupMenu
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        // Add a MouseListener to the Frame to show the PopupMenu on right-click
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Add the PopupMenu to the Frame
        add(popupMenu);

        // Set the Frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        practice p = new practice();
    }
}
