package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private  int id;
    private String name;
    private  int age;
    private  String gender;

    public Employees(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employees() {
    }

    public static List<Employees> createEmployees() {
        List<Employees>employee=new ArrayList<>();
        Employees employe=new Employees(0,"Xiaoming",20,"Male");
        employee.add(employe);
        employee.add(new Employees(1,"Xiaohong",19,"Female"));
        employee.add(new Employees(2,"Xiaozhi",15,"Male"));
        employee.add(new Employees(3,"Xiaogang",16,"Male"));
        employee.add(new Employees(4,"Xiaoxia",15,"Female"));
        //employee.add(employees);
        return  employee;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
