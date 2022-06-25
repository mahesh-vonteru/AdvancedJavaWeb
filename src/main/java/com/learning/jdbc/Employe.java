package com.learning.jdbc;

public class Employe {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String email;
    private String address;
    private String phonenomber;

    public Employe(int id, String name, String department, double salary, String email, String address, String phonenomber)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.address = address;
        this.phonenomber = phonenomber;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenomber() {
        return phonenomber;
    }

    public void setPhonenomber(String phonenomber) {
        this.phonenomber = phonenomber;
    }
}
