interface book1 {
   void book();

   void nobel();

   default void drama() {
      System.out.println("This is Drama Collection ...");
   }

}

class collection implements book1 {

   @Override
   public void book() {
      System.out.println("This is Book department ...");
   }

   @Override
   public void nobel() {
      System.out.println("This is Nobel department ...");

   }

   void literature() {
      System.out.println("This is literature department");
   }

}

public class ch7_DefaultInterface {
   public static void main(String[] args) {
      collection c = new collection();
      c.book();
      c.nobel();
      c.drama();
      c.literature();
   }
}
