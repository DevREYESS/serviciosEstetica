package com.reyes.estetica.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
    
    @Id
    private Long IdUser;
    private String nombre;
    private String apPat;
    private String apMat;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Cita> citas;

    public long getId() {
        return IdUser;
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
        IdUser = id;
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
