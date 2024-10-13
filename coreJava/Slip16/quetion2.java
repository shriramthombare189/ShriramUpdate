import java.util.Scanner;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class EmployeeSorter {
    static Employee[] employees; // Static array of Employee objects

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        employees = new Employee[n]; // Initialize the static array

        // Accept employee names from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            employees[i] = new Employee(name); // Create a new Employee object
        }

        // Sort employee names in ascending order
        sortEmployees();

        // Display sorted employee names
        System.out.println("\nSorted Employee Names:");
        for (Employee employee : employees) {
            System.out.println(employee.name);
        }

        scanner.close();
    }

    // Method to sort employees by name
    private static void sortEmployees() {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].name.compareTo(employees[j + 1].name) > 0) {
                    // Swap employees[j] and employees[j + 1]
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }
}
