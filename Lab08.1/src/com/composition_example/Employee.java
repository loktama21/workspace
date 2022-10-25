package com.composition_example;

public class Employee {
    private String name;
    private double salary;
    private Address address;

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getEmployeeInfo(){
        String employeeInfo = "Name: " + getName()+ ", Salary: $" + getSalary() + ", Address: " + address.getAddressInfo();
        return employeeInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
