package allprg;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
        System.out.println(name + "'s salary has been raised by " + percent + "%. New salary: $" + salary);
    }
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of employees from the user (up to a maximum of 5)
        System.out.print("Enter the number of employees (max 5): ");
        int numberOfEmployees = scanner.nextInt();
        if (numberOfEmployees < 1 || numberOfEmployees > 5) {
            System.out.println("Invalid number of employees. Exiting.");
            return;
        }
        // Create a list to hold employees
        List<Employee> employeeList = new ArrayList<>();
        // Input details for the specified number of employees
        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee salary: $");
            double salary = scanner.nextDouble();
            // Create an Employee object and add it to the list
            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }
        // Display initial details for all employees
        System.out.println("\nInitial Employee Details:");
        for (Employee employee : employeeList) {
            employee.displayDetails();
        }
        // Ask for a raise percentage
        System.out.print("\nEnter the percentage to raise salary: ");
        double raisePercentage = scanner.nextDouble();
        // Raise the salary for all employees and display updated details
        System.out.println("\nUpdated Employee Details after Salary Raise:");
        for (Employee employee : employeeList) {
            employee.raiseSalary(raisePercentage);
            employee.displayDetails();
        }
        scanner.close();
    }
}
