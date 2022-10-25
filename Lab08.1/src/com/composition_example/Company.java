package com.composition_example;

public class Company {
    private String companyName;
    private Employee[] employees = new Employee[100];

    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        System.out.println(employee);
    }

    public double computeTotalSalaryOfAllEmployees(){
        return 0.00;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
