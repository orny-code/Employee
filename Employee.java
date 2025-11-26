package OOP;

public class Employee {
        String name;
        double salary;

        // Constructor
        Employee(String empName, double empSalary) {
            name = empName;
            salary = empSalary;
        }

        // Method to calculate 10% bonus
        public void calculateBonus() {
            double bonus = salary * 0.10; // 10% of salary
            salary += bonus;
            System.out.println("10% bonus added successfully!");
        }

        // Method to display employee info

    public void displayInfo1() {
        System.out.println("Employee Name: " + name);
        System.out.println("Total Salary (before bonus): " + salary);
    }
        public void displayInfo() {
            System.out.println("Employee Name: " + name);
            System.out.println("Total Salary (after bonus): " + salary);
        }

        // Main method to test
        public static void main(String[] args) {
            Employee emp1 = new Employee("Orny", 50000);
            emp1.displayInfo1();

            System.out.println(" ");

            emp1.calculateBonus();
            emp1.displayInfo();
        }
    }

