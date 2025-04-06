import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(id + " | " + name + " | $" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Abi", 50000));
        employees.add(new Employee(102, "Babisha", 60000));
        employees.add(new Employee(103, "Chandra", 70000));

        System.out.println("ID | Name | Salary");
        System.out.println("-------------------");
        for (Employee emp : employees) emp.displayDetails();
    }
}
