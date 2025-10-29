interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + name + " | Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedBonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
        super(employeeId, name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }

    public void assignDepartment(String deptName) { this.department = deptName; }
    public String getDepartmentDetails() { return "Department: " + department; }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    public void assignDepartment(String deptName) { this.department = deptName; }
    public String getDepartmentDetails() { return "Department: " + department; }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee(101, "Yash Sharma", 40000, 5000),
                new PartTimeEmployee(102, "Riya Verma", 10000, 20, 300)
        };

        ((Department) employees[0]).assignDepartment("Development");
        ((Department) employees[1]).assignDepartment("Support");

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Total Salary: " + e.calculateSalary());
            System.out.println(((Department) e).getDepartmentDetails());
            System.out.println("------------------");
        }
    }
}
