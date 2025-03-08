package com.ashok.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.util.List;

@Entity

public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer empId;

    public List<Address> getAddr() {
        return addr;
    }

    public void setAddr(List<Address> addr) {
        this.addr = addr;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    private String empName;
    private Double salary;

@OneToMany(mappedBy ="emp" ,cascade=CascadeType.ALL)
    private List<Address> addr;
}
