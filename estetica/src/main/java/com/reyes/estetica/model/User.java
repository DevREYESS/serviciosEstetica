package com.reyes.estetica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
    private long Id;
    private String nombre;
    private String apPat;
    private String apMat;
    private String email;
    private String password;

    public long getId() {
        return Id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApPat(){
        return apPat;
    }

    public String getApMat(){
        return apMat;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public void setApPat(String apP){
        apPat = apP;
    }

    public void setApMat(String apM){
        apMat = apM;
    }

}
