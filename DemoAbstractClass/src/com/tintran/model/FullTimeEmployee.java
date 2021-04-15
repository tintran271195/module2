package com.tintran.model;

import com.tintran.util.Config;



public class FullTimeEmployee extends Employee{
    private final int kindOfEmployee;
    private final int extraDays;

    public FullTimeEmployee(String name, int extradays, int kindOfEmployee){
        super(name);

        this.extraDays  = extradays;
        this.kindOfEmployee = kindOfEmployee;
    }

    @Override
    public String kindOfEmployee() {
        return (this.kindOfEmployee == Config.BOSS?"Boss Full Time":"Staff Full Time");
    }

    @Override
    public void calSalary() {
                switch (this.kindOfEmployee){
                    case Config.BOSS:
                        this.salary = Config.SALARYBOSSFULLTIME + this.extraDays * Config.EXTRASALARY;
                        break;
                    case Config.STAFF:
                        this.salary = Config.SALARYSTAFFFULLTIME + this.extraDays * Config.EXTRASALARY;
                        break;
                }

    }
}
