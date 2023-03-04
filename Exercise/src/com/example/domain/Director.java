package com.example.domain;

public class Director extends Manager{

    private String approveRight;

    public String getApproveRight() {
        return approveRight;
    }

    public void setApproveRight(String approveRight) {

        this.approveRight = approveRight;
    }

    public Director(int empId, String name, String ssn, String salary, String departmentName) {
        super(empId, name, ssn, salary, departmentName);
    }

    public Director(int empId, String name, String ssn, String salary, String departmentName, String approveRight) {
        super(empId, name, ssn, salary, departmentName);
        this.approveRight = approveRight;
    }
}
