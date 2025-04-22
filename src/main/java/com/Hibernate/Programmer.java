package com.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="programmer_table") //to set name as per our choice not according to class name

public class Programmer {

    @Id
    private int pid;
    @Column(name="programmer_name") // to set ColumnName as per our choice not according to variable name
    private String pname;
    private String tech;

    public int getPid() {
        return pid;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
