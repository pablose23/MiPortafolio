/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculoact1.dto;

import java.util.Date;

/**
 *
 * @author centr
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int kilometraje;
    private Date fechaFabricacion;
    private String color;

    public Vehiculo(String marca, String modelo, int kilometraje, Date fechaFabricacion, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.fechaFabricacion = fechaFabricacion;
        this.color= color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String[] toArrayString() {
        String[] s= new String[5];
        s[0]= marca;
        s[1]= modelo;
        s[2]= Integer.toString(kilometraje);
        s[3]=fechaFabricacion.toString();
        s[4]=color;
        return s;
    }
}
