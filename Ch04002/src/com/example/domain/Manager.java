package com.example.domain;

public class Manager extends  Employee{

    private  String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public Manager(String deptName) {
        this.deptName = deptName;
    }
    public Manager(int empId, String name, String ssn, int salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }



    @Override
    public String getDetails(){
        return super.getDetails() + " Dept: " + deptName;
    }
}
