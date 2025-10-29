import java.util.*;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName) { this.deptName = deptName; }

    public void addEmployee(String name) { employees.add(new Employee(name)); }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees)
            System.out.println("- " + e.getName());
    }
}

class Company {
    private String companyName;
    private List<Department> departments = new ArrayList<>();

    public Company(String companyName) { this.companyName = companyName; }

    public void addDepartment(Department dept) { departments.add(dept); }

    public void showStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments)
            d.showEmployees();
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company c = new Company("TechNova Pvt Ltd");

        Department d1 = new Department("Development");
        Department d2 = new Department("HR");

        d1.addEmployee("Yash Sharma");
        d1.addEmployee("Riya Verma");
        d2.addEmployee("Aman Gupta");

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showStructure();

        c = null;
        System.gc();
        System.out.println("Company deleted -> Departments and Employees removed from memory.");
    }
}
