package com.example.domain;

import java.lang.reflect.Field;

public class Employee {
    private  int empId;
    private  String name;

    private String ssn;

    private  int salary;

    public Employee() {
    }
//...

    public Employee(int empId, String name, String ssn, int salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDetails()
    {
        return  "ID: " +empId + " Name :" + name;
    }

    public double calcBonus()
    {
        return  this.salary * GoodBonus.getBonusPercent(this);
    }

    public String toString(){
        return "Employee id: " + empId+"\n"+ "Employee name" +name;
    }


    @Override
    public boolean equals (Object o) {
        boolean result = false;
        if ((o != null) && (o instanceof Employee)) {
            Employee e = (Employee)o;
            if ((e.empId == this.empId) && (e.name.equals(this.name)) && (e.ssn.equals(this.ssn)) && (e.salary == this.salary)) {
                result = true;
            }
        } return result;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + empId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}