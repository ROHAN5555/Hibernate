package com.Hibernate;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="programmer_table") //to set name as per our choice not according to class name

public class Programmer {

    @Id
    private int pid;
    @Column(name="programmer_name") // to set ColumnName as per our choice not according to variable name
    private String pname;
    private String tech;

//    @OneToOne
//    private Laptop Laptop;

    @Override
    public String toString() {
        return "Programmer{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    //@OneToMany // this will be used when a extra table is needed to create which consists of both the ids of programmer and laptops
    @ManyToMany
    private List<Laptop> laptops;




    public int getPid() {
        return pid;
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
