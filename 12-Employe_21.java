import java.util.Scanner;

class Employee {
    int empNumber;
    String empName;
    double basicPay;

   
    void getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        empNumber = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter Employee Name: ");
        empName = scanner.nextLine();

        System.out.print("Enter Basic Pay: ");
        basicPay = scanner.nextDouble();
    }

    
    void calculateGrossSalary() {
        double DA = 0.2 * basicPay;
        double HRA = 0.05 * basicPay;
        double grossSalary = basicPay + DA + HRA;

        System.out.println("\nEmployee Details:");
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (20% of Basic Pay): " + DA);
        System.out.println("HRA (5% of Basic Pay): " + HRA);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Employe_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

   
        Employee[] employees = new Employee[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].getEmployeeDetails();
        }

        
        for (Employee employee : employees) {
            employee.calculateGrossSalary();
        }

        scanner.close();
    }
}
