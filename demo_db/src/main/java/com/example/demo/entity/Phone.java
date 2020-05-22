package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MENSCH")
public class Phone
{
    private long id;
    private String name;
    private String nummer;
    private Date datum;

    public Phone(String name, String nummer) {
        super();
        this.name = name;
        this.nummer = nummer;
    }
    public Phone(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    @Column(name = "Name", nullable = false)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Column(name = "Nummer", nullable = false)
    public String getNummer() {
        return nummer;
    }
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "Datum")
    public Date getDatum() { return datum; }
    public void setDatum(Date datum) { this.datum = datum; }

    @Override
    public String toString() {
        return "ФИО: " + getName() + " | Номер телефона: " + getNummer();
    }
}
