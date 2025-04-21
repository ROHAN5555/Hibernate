package com.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int rollNo;
    private String sName;
    private int sAge;

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sAge=" + sAge +
                ", sName='" + sName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }




}
