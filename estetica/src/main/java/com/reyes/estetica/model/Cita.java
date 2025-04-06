package com.reyes.estetica.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cita {
    
    @Id
    private Long IdCita;
    private LocalDate fechaCita;
    private LocalTime horaCita;

    @ManyToOne
    @JoinColumn(name = "IdUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "IdService")
    private Service service;


    public long getIdCita(){
        return IdCita;
    }

    public LocalDate getFechaCita(){
        return fechaCita;
    }

    public LocalTime getHoraCita(){
        return horaCita;
    }

    public User getIdUser(){
        return user;
    }

    public Service getIdService(){
        return service;
    }
}
