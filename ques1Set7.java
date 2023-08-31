// 1. Write Java code as instructed.
// • Define class Employee that has the following members.
// – String name, double salary as private instance variables
// – Mutator methods to update the instance variables of an Employee
// – Accessor methods to access the instance variables of an Employee
// – Method public double bonus(float percent) that returns the bonus
// computed as (percent/100.0)*salary
// • Define class Manager that extends class Employee and has the
// following members.
// – String secretary as private instance variable
// – Mutator method to update the instance variable
// – Accessor method to access the instance variable
// – Override public double bonus(float percent) that returns the bonus
// of a Manager as 50 percent extra bonus than a regular employee
// • Define class InheritanceTest that has the main method.
// – Create object obj1 of Manager using an Employee class reference
// variable – Mutator methods to set the values of name and salary –
// Create object obj2 of Manager using an Manager class reference
// variable – Mutator method to set the value of secretary for obj2 –
// Accessor methods for name and salary using obj1 – Invoke method
// bonus(float percent) using obj1 – Accessor method of secretary using
// obj2
class Employee5 {
    private String name;
    private double salary;

    public void setNameE(String name) {
        this.name = name;
    }

    public void setSalaryE(double salary) {
        this.salary = salary;
    }

    public String getNameE() {
        return name;
    }

    public double getSalaryE() {
        return salary;
    }

    public double bonus(float percent)
     {
       return (percent/100.0)*salary ;
     }
}

class Manager extends Employee5 {
 
    private String secretary;

    public void setname(String secretary) {
        this.secretary = secretary;
    }

    public String getname() {
        return secretary;
    }

    @Override
   public double bonus(float percent)
    {
        double OData=super.bonus(percent);
        double Ndata=OData+(OData*0.5);
        return Ndata;
    }
}

public class ques1Set7 {
    public static void main(String[] args) {

        Employee5 obj1 = new Manager();

        obj1.setNameE("Rohit ji ");
        obj1.setSalaryE(60000);
        double e = obj1.bonus(10);

        Manager obj2 = new Manager();
        obj2.setname("Aashish ji");
        double s = obj2.bonus(20);

        System.out.println("Employee Name: " + obj1.getNameE());
        System.out.println("Employee Salary: $" + obj1.getSalaryE());
        System.out.println("Employee bonus = " + e);

        System.out.println("Secretary: " + obj2.getname());
        System.out.println("Seceratery bonus = " + s);
    }
}
