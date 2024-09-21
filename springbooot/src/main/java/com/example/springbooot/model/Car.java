package com.example.springbooot.model;


import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 숫자 늘어남
    private Long id;

    private String model;
    private String company;

    public Car() {
    }

    public Car(Long id, String model, String company) {
        this.id = id;
        this.model = model;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
