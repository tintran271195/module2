package com.tintran.model;
public abstract class Employee {
    protected String name;
    protected long salary;
    public Employee(){

    }
    public Employee(String name){
        this.name = name;
    }
    protected abstract String kindOfEmployee();
    public abstract void calSalary();
    public void displayInformation(){
        calSalary();
        System.out.println("Name: " + this.name + " Position: " + kindOfEmployee() + " salary: " + this.salary +".");
    }

}
