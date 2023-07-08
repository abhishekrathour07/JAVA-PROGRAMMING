package bca.fulltime.student;

import java.util.Scanner;

public class bcastudent {
    Scanner input = new Scanner(System.in);
    String name, sex;
    int age;

   public void setdata() {
        System.out.println("Enter the name");
        name = input.nextLine();
        System.out.println("Enter the Sex");
        sex = input.nextLine();
        System.out.println("Enter the age");
        age = input.nextInt();
    }

    public void getdata() {
        System.out.println("Student name = " + name);
        System.out.println("Student Sex = " + sex);
        System.out.println("Student Age = " + age);
        
    }
}
