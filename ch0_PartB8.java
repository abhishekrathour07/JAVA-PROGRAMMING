import java.awt.*;

public class ch0_PartB8 {
    ch0_PartB8() {
        Frame fr = new Frame("Menu Demo");
        MenuBar mb = new MenuBar();
        Menu fileMenu = new Menu("New");
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(viewMenu);
        MenuItem a1 = new MenuItem("New");
        MenuItem a2 = new MenuItem("Open");
        MenuItem a3 = new MenuItem("Save");
        MenuItem b1 = new MenuItem("Paste");
        MenuItem b2 = new MenuItem("Copy");
        MenuItem c1 = new MenuItem("Find");
        MenuItem c2 = new MenuItem("Show");
        fileMenu.add(a1);

        fileMenu.add(a2);
        fileMenu.add(a3);
        editMenu.add(b1);
        editMenu.add(b2);
        viewMenu.add(c1);
        viewMenu.add(c2);
        fr.setMenuBar(mb);
        fr.setSize(200, 200);
        fr.setLayout(null);
        fr.setVisible(true);
    }

    public static void main(String agrs[]) {
        new ch0_PartB8();
    }
}
