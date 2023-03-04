package com.example.domain;

public class Director extends Manager{

    private  boolean canApprove;

    public boolean isCanApprove() {
        return canApprove;
    }

    public void setCanApprove(boolean canApprove) {
        this.canApprove = canApprove;
    }

    public Director(String deptName) {
        super(deptName);
    }
    public Director(int empId, String name, String ssn, int salary, String deptName) {
        super(empId, name, ssn, salary, deptName);
    }

    public Director(int empId, String name, String ssn, int salary, String deptName, boolean canApprove) {
        super(empId, name, ssn, salary, deptName);
        this.canApprove = canApprove;
    }
    @Override
    public int hashCode() {
        int result = 25;
        result = 56 * result + super.getEmpId();
        result = 56 * result + (super.getName()!= null ?super.hashCode() : 0);
        return result;
    }
}
