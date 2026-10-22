/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_13.dto;

/**
 *
 * @author centr
 */
public class Clase {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String curso;
    private String turno;
    private int nota;

    public Clase(String nombre, String apellido1, String apellido2, String curso, String turno, int nota) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.curso = curso;
        this.turno = turno;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public String[] toArrayString(){
        String[] s= new String[6];
        s[0]=nombre;
        s[1]=apellido1;
        s[2]=apellido2;
        s[3]=curso;
        s[4]=turno;
        s[5]=Integer.toString(nota);
        return s;
    }
    
}
