class Employee4 {
    String name;
    double salary;
    
    Employee4(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    Employee4(Employee4 e) {
        this.name = e.name;
        this.salary = e.salary;
    }
}

public class copyc {
    public static void main(String[] args) {
        Employee4 e1 = new Employee4("abhishek singh", 50000.0);
        Employee4 e2 = new Employee4(e1);
        System.out.println("e1 Name: " + e1.name + ", Salary: " + e1.salary);
        System.out.println("e2 Name: " + e2.name + ", Salary: " + e2.salary);
    }
}
