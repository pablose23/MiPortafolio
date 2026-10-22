/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author centr
 */
public class Estudiante {
    private int id;
    private String nombre;
    private String apellidos;
    private String curiosidad;
    private double progreso;

    public Estudiante(int id, String nombre, String apellidos, String curiosidad, double progreso) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curiosidad = curiosidad;
        this.progreso = progreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCuriosidad() {
        return curiosidad;
    }

    public void setCuriosidad(String curiosidad) {
        this.curiosidad = curiosidad;
    }

    public double getProgreso() {
        return progreso;
    }

    public void setProgreso(double progreso) {
        this.progreso = progreso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curiosidad=" + curiosidad + ", progreso=" + progreso + '}';
    }
}
