package com.tutorial.onetoone.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Carnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(unique = true)
    private String dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "socio_id", referencedColumnName = "id")
    private Socio socio;

    public Carnet() {
    }

    public Carnet(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
