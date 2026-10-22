

package logica;

import dto.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author centr
 */
public class LogicaNegocio {
    public List<Alumno>listaAlumnos= new ArrayList<>();
    public LogicaNegocio(){
        listaAlumnos=new ArrayList<>();
        listaAlumnos.add(new Alumno("Pablo", "DAM2"));
        listaAlumnos.add(new Alumno("Juan", "DAM1"));
        listaAlumnos.add(new Alumno("Pedro", "DAM1"));
    }
    public List<Alumno> getListaAlumnos(){
        return listaAlumnos;
    }
}
