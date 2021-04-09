package com.tintran.model;

import com.tintran.util.Config;

public class EmployeePartTime extends Employee{
    private int workHour;
    public EmployeePartTime(){

    }
    public EmployeePartTime(String name, int workHour){
        super(name);
        this.workHour = workHour;
    }

    @Override
    public String kindOfEmployee() {
        return "Employee PartTime";
    }

    @Override
    public void calSalary() {
        this.salary = Config.SALARYPARTTIME * this.workHour;
    }
}
