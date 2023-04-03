package com.DomaciIzWeba.Web.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String number;
    @Column
    private String email;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Employee employee;

    public Company getKompanija() {
        return company;
    }

    public void setKompanija(Company kompanija) {
        this.company = kompanija;
    }

    public Employee getRadnik() {
        return employee;
    }

    public void setRadnik(Employee radnik) {
        this.employee = radnik;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email +
                '}';
    }
}
