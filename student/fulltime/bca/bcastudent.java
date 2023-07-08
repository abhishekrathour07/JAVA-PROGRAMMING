package student.fulltime.bca;

import java.util.Scanner;

public class bcastudent {
    String name, sex;
    int age;
    Scanner sc = new Scanner(System.in);

    public void setdata() {
        System.out.println("Enter the student name");
        name = sc.nextLine();
        System.out.println("Enter the student age");
        age = sc.nextInt();
        System.out.println("Enter the student sex");
        sex = sc.next();
    }

    public void getdata() {
        System.out.println("Student details are : ");
        System.out.println("Student name = " + name);
        System.out.println("Student sex = " + sex);
        System.out.println("Student age = " + age);

    }
}