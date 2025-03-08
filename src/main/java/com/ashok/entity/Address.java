package com.ashok.entity;

import jakarta.persistence.*;

@Entity
public class Address {

    public Integer getAddrId() {
        return addrId;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer addrId;
    private String city;
    private String state;

    @ManyToOne
    @JoinColumn(name="emp_Id")
    private Employee emp;
}
