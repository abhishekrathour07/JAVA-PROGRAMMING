class Parent {   
    String name;
    
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
    void show(){
        System.out.println("This is showing Something");
    }
}   
    
class Child extends Parent {   
    int age;   
    
    // @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
      void showMessage1()   
    {   
        System.out.println("Child method is called without overriding");   
    }   
}   
    
public class ch7_UpcastDowncast{  
    
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Shubham";  
        //   p.age = 18; --> its gives a error because in upcasting we cannot access child class 
        p.showMessage();
        // p.showMessage1();  --> Error bcz we cannot access child calss element or mrthods 
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
        // Performing Downcasting Explicitly   
        Child c = (Child)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
        c.showMessage1();
        c.show();
    }   
}  