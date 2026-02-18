
	/*
	 * A company requires a **secure employee payroll system** where sensitive data must be protected, and access should be strictly controlled based on roles.

You are required to design this system using **encapsulation, abstraction, polymorphism, and exception handling**.

---

## Requirements

### 1. Employee Model
Each employee must have:
- Employee ID
- Name
- Role
- Salary

### 2. Encapsulation
- Salary must be `private`.
- Direct access to salary is prohibited.
- Salary updates must go through controlled setters.

### 3. Authorization Rules
- Only HR role is allowed to modify salary.
- Unauthorized access must be blocked.

### 4. Abstraction
- Use an interface to define payroll behavior.
- Implement payroll differently for:
  - Full-time employees
  - Contract employees

### 5. Polymorphism
- Use method overriding for payroll calculation.
- Use method overloading where applicable.

### 6. Exception Handling
- Custom unchecked exception:
  - `UnauthorizedAccessException`
- Custom checked exception:
  - `InvalidSalaryException`
- Demonstrate exception propagation and proper handling.

---

## Constraints

- No public variables.
- No duplicate logic.
- No misuse of static methods.
- Entire solution must be written in **a single Java file**.

---

	 */
package m1_tasks;
import java.util.Scanner;

public class Test1{

    static class UnauthorizedAccessException extends RuntimeException {
        public UnauthorizedAccessException(String message) {
            super(message);
        }
    }

    static class InvalidSalaryException extends Exception {
        public InvalidSalaryException(String message) {
            super(message);
        }
    }

    interface Payroll {
        double calculatePay();
        void generatePayslip();
    }

    static abstract class Employee implements Payroll {
        private final int employeeId;
        private final String name;
        private final String role;
        private double salary;

        public Employee(int employeeId, String name, String role, double salary) throws InvalidSalaryException {
            this.employeeId = employeeId;
            this.name = name;
            this.role = role;
            validateSalary(salary);
            this.salary = salary;
        }

        public final double getSalary() {
            return salary;
        }

        public final int getEmployeeId() {
            return employeeId;
        }

        public final String getName() {
            return name;
        }

        public final String getRole() {
            return role;
        }

        public final void setSalary(double newSalary, String requesterRole) throws InvalidSalaryException {
            authorizeSalaryChange(requesterRole);
            updateSalaryInternal(newSalary);
        }

        public final void setSalary(double newSalary, Employee requester) throws InvalidSalaryException {
            if (requester == null) {
                throw new UnauthorizedAccessException("Requester cannot be null.");
            }
            authorizeSalaryChange(requester.getRole());
            updateSalaryInternal(newSalary);
        }

        private void updateSalaryInternal(double newSalary) throws InvalidSalaryException {
            validateSalary(newSalary);
            this.salary = newSalary;
        }

        private void validateSalary(double salary) throws InvalidSalaryException {
            if (salary <= 0) {
                throw new InvalidSalaryException("Invalid Salary: Salary must be greater than 0.");
            }
        }

        private void authorizeSalaryChange(String requesterRole) {
            if (requesterRole == null || !requesterRole.equalsIgnoreCase("HR")) {
                throw new UnauthorizedAccessException("Access Denied: Only HR can modify salary.");
            }
        }

        
        public abstract double calculatePay();

        
        public void generatePayslip() {
            System.out.println("------ PAYSLIP ------");
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name        : " + name);
            System.out.println("Role        : " + role);
            System.out.println("Base Salary : " + salary);
            System.out.println("Pay Amount  : " + calculatePay());
            System.out.println("---------------------");
        }
    }

    static class FullTimeEmployee extends Employee {
        private final double bonus;

        public FullTimeEmployee(int employeeId, String name, String role, double salary, double bonus)
                throws InvalidSalaryException {
            super(employeeId, name, role, salary);
            if (bonus < 0) {
                throw new InvalidSalaryException("Invalid Bonus: Bonus cannot be negative.");
            }
            this.bonus = bonus;
        }

       
        public double calculatePay() {
            return getSalary() + bonus;
        }
    }

    static class ContractEmployee extends Employee {
        private final int hoursWorked;
        private final double hourlyRate;

        public ContractEmployee(int employeeId, String name, String role, double salary, int hoursWorked, double hourlyRate)
                throws InvalidSalaryException {
            super(employeeId, name, role, salary);

            if (hoursWorked < 0) {
                throw new InvalidSalaryException("Invalid Hours: Hours worked cannot be negative.");
            }
            if (hourlyRate <= 0) {
                throw new InvalidSalaryException("Invalid Hourly Rate: Must be greater than 0.");
            }

            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        
        public double calculatePay() {
            return hoursWorked * hourlyRate;
        }
    }

    static class PayrollService {
        public void updateEmployeeSalary(Employee target, double newSalary, String requesterRole)
                throws InvalidSalaryException {
            target.setSalary(newSalary, requesterRole);
        }

        public void printPayroll(Employee employee) {
            employee.generatePayslip();
        }
    }

    public static void main(String[] args) {
        try {
            PayrollService service = new PayrollService();

            Employee e1 = new FullTimeEmployee(101, "Jack", "Software Developer", 50000, 8000);
            Employee e2 = new ContractEmployee(102, "Jill", "Tester", 1, 120, 350);

            Payroll p1 = e1;
            Payroll p2 = e2;

            System.out.println("\n=== Initial Payslips ===");
            p1.generatePayslip();
            p2.generatePayslip();

            System.out.println("\n=== Unauthorized Salary Update Attempt ===");
            try {
                service.updateEmployeeSalary(e1, 70000, "Developer");
            } catch (UnauthorizedAccessException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("\n=== Authorized Salary Update Attempt ===");
            try {
                service.updateEmployeeSalary(e1, 70000, "HR");
                System.out.println("Salary updated successfully.");
            } catch (InvalidSalaryException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("\n=== Invalid Salary Update Attempt ===");
            try {
                service.updateEmployeeSalary(e1, -2000, "HR");
            } catch (InvalidSalaryException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("\n=== Updated Payslip ===");
            service.printPayroll(e1);

            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter requester role (HR/Other): ");
            String requester = sc.nextLine();

            System.out.print("Enter new salary for Jack: ");
            double newSalary = sc.nextDouble();

            try {
                e1.setSalary(newSalary, requester);
                System.out.println("Salary updated. New Salary = " + e1.getSalary());
            } catch (UnauthorizedAccessException ex) {
                System.out.println(ex.getMessage());
            } catch (InvalidSalaryException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("\nFinal Payslip:");
            e1.generatePayslip();

            sc.close();

        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}