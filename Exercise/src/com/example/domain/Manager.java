package com.example.domain;

public class Manager  extends Employee{

    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Manager(int empId,String name,String ssn,String salary,String departmentName)
    {
        super(empId,name,ssn,salary);
        this.departmentName=departmentName;

    }


    public String riseSalary(String amount)
    {

        return super.setSalary(amount);
    }

}
