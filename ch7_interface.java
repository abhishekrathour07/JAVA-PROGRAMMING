interface camera{
       void takingpic();

       void msgwhiletaking();
       default void mereram(){
        System.out.println("Bolo Jai shree ram");
       }
}
class saurabh implements camera{

    @Override
    public void takingpic() {
        System.out.println("I am taking picture ");
    }

    @Override
    public void msgwhiletaking() {
        System.out.println("Smile please...");
        
    }

    
}
public class ch7_interface {
    public static void main(String[] args) {
        saurabh s = new saurabh();
        s.takingpic();
        s.msgwhiletaking();
       
    }
    
}
  