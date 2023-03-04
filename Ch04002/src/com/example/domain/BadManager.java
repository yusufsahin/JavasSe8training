package com.example.domain;

public class BadManager extends Employee{
    private String deptName;
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public BadManager(String deptName) {
        this.deptName = deptName;
    }

    public BadManager(int empId, String name, String ssn, int salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }


    //Make public
    //@Override
    //private String getDetails(){
    //    return  super.getDetails()+" Dept "+deptName;
    //}

}
