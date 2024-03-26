package com.java.oop.Association;

import java.util.ArrayList;
import java.util.List;

// Employee class representing an employee
class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

// Department class representing a department
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

public class OneToManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee employee1 = new Employee("Alice", 101);
	        Employee employee2 = new Employee("Bob", 102);

	        // Create a department
	        Department department = new Department("Engineering");

	        // Add employees to the department
	        department.addEmployee(employee1);
	        department.addEmployee(employee2);

	        // Retrieve employees of the department
	        List<Employee> employees = department.getEmployees();

	        // Print information
	        System.out.println("Employees of " + department.getName() + " department:");
	        for (Employee employee : employees) {
	            System.out.println("Name: " + employee.getName() + ", Employee ID: " + employee.getEmployeeId());
	        }

	}

}
