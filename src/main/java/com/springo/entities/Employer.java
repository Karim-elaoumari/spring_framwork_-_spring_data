package com.springo.entities;

public class Employer {
    private Long id;
    private String name;
    private String email;
    private Departement departement;

    public Employer() {
    }
    public Employer(Long id, String name, String email, Departement departement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departement = departement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
