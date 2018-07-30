package com.iotek.model;

import java.io.Serializable;

/**
 * Created by thinkpad on 2018/7/27.
 */
public class Recruit implements Serializable {
    private int id;
    private String department;
    private String position;
    private int salary;
    private int num;//人数

    public Recruit() {
    }

    public Recruit(int id, String department, String position, int salary, int num) {
        this.id = id;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", 部门='" + department + '\'' +
                ", 职位='" + position + '\'' +
                ", 薪资=" + salary +
                ", 人数=" + num +
                '}';
    }
}
