import java.time.LocalDate;

class Employee3 {
    String name;
    LocalDate appDate;

    public Employee3(String name, LocalDate appDate) {
        this.name = name;
        this.appDate = appDate;
    }

    public void display() {
        System.out.println("Employee name: " + name + "  Appointment date: " + appDate);
    }
}

class ch9_Labprogram9 {
    public static void main(String[] args) {
        Employee3[] employees = new Employee3[5];

        employees[0] = new Employee3("Shaha PD", LocalDate.of(1999, 5, 22));
        employees[1] = new Employee3("Patil AS", LocalDate.of(2000, 1, 12));
        employees[2] = new Employee3("Phadake PV", LocalDate.of(2009, 4, 25));
        employees[3] = new Employee3("Shinde SS", LocalDate.of(2005, 2, 19));
        employees[4] = new Employee3("Shrivastav RT", LocalDate.of(2010, 1, 1));

        System.out.println("List of employees:");
        for (Employee3 emp : employees) {
            emp.display();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (employees[i].appDate.isAfter(employees[j].appDate)) {
                    Employee3 temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        System.out.println("\nList of employees sorted by seniority:");
        for (Employee3 emp : employees) {
            emp.display();
        }
    }
}
