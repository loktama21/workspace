package com.composition_example;

public class Employee_Client {
    public static void main(String[] args) {
        Employee employee = new Employee("Sam", 15_000.00, new Address("Dallas", "USA"));
        System.out.println(employee.getEmployeeInfo());
    }
}
