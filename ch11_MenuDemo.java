import java.awt.*;

public class ch11_MenuDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Frame");
        MenuBar m = new MenuBar();
        Menu file = new Menu("files");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        m.add(file);
        m.add(edit);
        m.add(view);
        MenuItem a1 = new MenuItem("new");
        MenuItem a2 = new MenuItem("Save");
        MenuItem a3 = new MenuItem("Open");
        MenuItem a4 = new MenuItem("Save as");
        MenuItem b1 = new MenuItem("Cut");
        MenuItem b2 = new MenuItem("Copy");
        MenuItem b3 = new MenuItem("Paste");
        MenuItem c1 = new MenuItem("Show");
        MenuItem c2 = new MenuItem("Find");
       
        file.add(a1);
        file.add(a2);
        file.add(a3);
        file.add(a4);

        edit.add(b1);
        edit.add(b2);
        edit.add(b3);

        view.add(c1);
        view.add(c2);
        
        f.setMenuBar(m);
        f.setVisible(true);
        f.setSize(150, 250);

    }
}
