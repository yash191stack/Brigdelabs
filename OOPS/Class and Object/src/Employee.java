package com.bridgelabz.oops.levelone;

class Employee {
    // Non-static variables
    String name;
    int id;
    double salary;

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee(); // creating object
        // assigning values
        emp.name = "Rohan";
        emp.id = 1;
        emp.salary = 500000;

        emp.displayEmployee(); // calling display method
    }
}
