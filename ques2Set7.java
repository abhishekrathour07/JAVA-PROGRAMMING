// 2• Define class Employee that has the following members.
// – String name, double salary as private instance variables
// – Constructor to initialize the instance variables
// – Define method print() to display name and salary of an Employee
// – Overload method print() as print(float percent) to display the name,
// salary and bonus of an Employee
// – Method public double bonus(float percent) that returns the bonus
// computed as (percent/100.0)*salary
// • Define class Manager that extends class Employee and has the
// following members.
// – String secretary as private instance variable
// – Define a constructor to initialize the instance variables of Manager
// that includes the instance variables of Employee
// – Override method print() to display the name, salary and secretary of
// Manager.
// – Override method print(float percent) to display the name, salary,
// secretary and bonus of a Manager
// – Override public double bonus(float percent) that returns the bonus
// of a Manager as 50 percent extra bonus than a regular employee
// • Define class InheritanceTest that has the main method.
// – Here, take two reference variables obj1 and obj2 of an Employee.
// – Initialize obj1 with Employee class object.
// – Initialize obj2 with Manager class object.
// – call print() and print(float percent) methods using both obj1 and
// obj2

class Employee6 {
    private String name;
    private double salary;

    Employee6(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public void print() {
        System.out.println("name = " + name + "salary = " + salary);
    }

    public void print(float percent) {
        System.out.println("name = " + name + "  salary = " + salary + "bonus percentage = " + percent);
    }

    public double bonus(float percent) {
        return ((percent / 100.0) * salary);
    }
}

class manager2 extends Employee6 {

    private String secretary;

    manager2(String name, double salary, String secretary) {
        super(secretary, salary);
        this.secretary = secretary;

    }

    @Override
    public void print() {
        super.print();
        System.out.print(" Seceratery name = " + secretary);

    }

    @Override
    public double bonus(float percent) {
        double OData = super.bonus(percent);
        double Ndata = OData + (OData * 0.5);
        return Ndata;
    }
}

public class ques2Set7 {
    public static void main(String[] args) {
        System.out.println("EMPLOYEE CLASS INFORMATION");
        Employee6 e1 = new Employee6(" Abhishek ", 25000);
        e1.print();
        e1.print(10);
        e1.bonus(10);
        System.out.println("Bonus = " + e1.bonus(10));
        System.out.println("MANAGER CLASS INFORMATION");
        manager2 e2 = new manager2(" Rahul ", 25000, "Rohit");
        e2.print();
        System.out.println("Bonus = " + e2.bonus(10));
        
    }

}