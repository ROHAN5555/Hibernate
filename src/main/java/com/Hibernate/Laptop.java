package com.Hibernate;

import jakarta.persistence.*;

import java.util.List;

// we have used this annotation as laptop variable is used as an object which cannot be stored in a table directly
// so using this annotation we can merge the atop variables as column names of programmer table

@Entity

public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private String ram;

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", programmers=" + programmers +
                '}';
    }


//@ManyToOne
//    private Programmer programmer; // this 2 lines will be use when one laptop is used by multiple programmers

    @ManyToMany(mappedBy = "laptops")
    private List<Programmer> programmers;

    public List<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(List<Programmer> programmers) {
        this.programmers = programmers;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }
}
