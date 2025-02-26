package com.codurance.ocp;

public abstract class Employee {

    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    public abstract int payAmount();

}