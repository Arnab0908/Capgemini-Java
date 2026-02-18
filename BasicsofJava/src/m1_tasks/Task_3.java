package m1_tasks;


import java.util.Scanner;

public class Task_3 {

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

        public Employee(int employeeId, String name, String role, double salary)
                throws InvalidSalaryException {
            this.employeeId = employeeId;
            this.name = name;
            this.role = role;
            validateSalary(salary);
            this.salary = salary;
        }

        public final double getSalary() {
            return salary;
        }

        public final String getRole() {
            return role;
        }

        public final void setSalary(double newSalary, String requesterRole)
                throws InvalidSalaryException {
            authorizeSalaryChange(requesterRole);
            validateSalary(newSalary);
            this.salary = newSalary;
        }

        private void validateSalary(double salary) throws InvalidSalaryException {
            if (salary <= 0) {
                throw new InvalidSalaryException("Salary must be greater than 0");
            }
        }

        private void authorizeSalaryChange(String requesterRole) {
            if (!"HR".equalsIgnoreCase(requesterRole)) {
                throw new UnauthorizedAccessException("Only HR can update salary");
            }
        }

        @Override
        public abstract double calculatePay();

        @Override
        public void generatePayslip() {
            System.out.println("============");
            System.out.println("ID     : " + employeeId);
            System.out.println("Name   : " + name);
            System.out.println("Role   : " + role);
            System.out.println("Salary : " + salary);
            System.out.println("Pay    : " + calculatePay());
            System.out.println("===============");
        }
    }

    static class FullTimeEmployee extends Employee {
        private final double bonus;

        public FullTimeEmployee(int id, String name, String role,
                                double salary, double bonus)
                throws InvalidSalaryException {
            super(id, name, role, salary);
            if (bonus < 0)
                throw new InvalidSalaryException("Bonus cannot be negative");
            this.bonus = bonus;
        }

        @Override
        public double calculatePay() {
            return getSalary() + bonus;
        }
    }

    static class ContractEmployee extends Employee {
        private final int hoursWorked;
        private final double hourlyRate;

        public ContractEmployee(int id, String name, String role,
                                double salary, int hours, double rate)
                throws InvalidSalaryException {
            super(id, name, role, salary);
            if (hours < 0 || rate <= 0)
                throw new InvalidSalaryException("Invalid hours or rate");
            this.hoursWorked = hours;
            this.hourlyRate = rate;
        }

        @Override
        public double calculatePay() {
            return hoursWorked * hourlyRate;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Employee Type (1-FullTime, 2-Contract): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Employee Role: ");
            String role = sc.nextLine();

            System.out.print("Base Salary: ");
            double salary = sc.nextDouble();

            Employee emp;

            if (type == 1) {
                System.out.print("Bonus: ");
                double bonus = sc.nextDouble();
                emp = new FullTimeEmployee(id, name, role, salary, bonus);
            } else {
                System.out.print("Hours Worked: ");
                int hours = sc.nextInt();

                System.out.print("Hourly Rate: ");
                double rate = sc.nextDouble();

                emp = new ContractEmployee(id, name, role, salary, hours, rate);
            }

            emp.generatePayslip();

            System.out.print("Requester Role: ");
            sc.nextLine();
            String requester = sc.nextLine();

            System.out.print("New Salary: ");
            double newSalary = sc.nextDouble();

            emp.setSalary(newSalary, requester);

            System.out.println("Salary updated successfully");

            emp.generatePayslip();

        } catch (InvalidSalaryException | UnauthorizedAccessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
