package com.reyes.estetica.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Service {
    @Id
    private Long IdService;
    private String tipo;
    private String nombre;
    private double precio;
    private String dificultad;
    private String rutaImg;

    @OneToMany(mappedBy = "service")
    private List<Cita> citas;


    public Long getIdService(){
        return IdService;
    }

    public String getTipo(){
        return tipo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public String getDificultad(){
        return dificultad;
    }

    public String getRutaImg(){
        return rutaImg;
    }

    public void setIdService( long id){
        IdService = id;
    }

    public void setTipo(String Tipo){
        tipo = Tipo;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public void setPrecio(double Precio){
        precio = Precio;
    }

    public void setDificultad(String Dif){
        dificultad = Dif;
    }

    public void setRutaImg(String ruta){
        rutaImg = ruta;
    }

}
