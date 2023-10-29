package com.gl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeAddress")
    private String employeeAddress;

    @Column(name = "employeePhone")
    private String employeePhone;

    @Column(name = "employeeSalary")
    private String employeeSalary;

    public Employee() {
        super();
    }

    public Employee(int id, String employeeName, String employeeAddress, String employeePhone, String employeeSalary) {
        super();
        this.id = id;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.employeeSalary = employeeSalary;
    }

    public Employee(String employeeName, String employeeAddress, String employeePhone, String employeeSalary) {
        super();
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.employeeSalary = employeeSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress
                + ", employeePhone=" + employeePhone + ", employeeSalary=" + employeeSalary + "]";
    }
}
