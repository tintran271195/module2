package com.tintran.model;

import com.tintran.util.Config;



public class FullTimeEmployee extends Employee{
    private int kindofemployee;
    private int extradays;

    public FullTimeEmployee(String name, int extradays, int kindofemployee){
        super(name);
        this.extradays  = extradays;
        this.kindofemployee = kindofemployee;
    }

    @Override
    public String kindOfEmployee() {
        return (this.kindofemployee == Config.BOSS?"Boss Full Time":"Staff Full Time");
    }

    @Override
    public void calSalary() {
                switch (this.kindofemployee){
                    case Config.BOSS:
                        this.salary = Config.SALARYBOSSFULLTIME + this.extradays * Config.EXTRASALARY;
                        break;
                    case Config.STAFF:
                        this.salary = Config.SALARYSTAFFFULLTIME + this.extradays * Config.EXTRASALARY;
                        break;
                }

    }
}
