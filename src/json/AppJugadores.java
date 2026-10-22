package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AppJugadores {
	private ArrayList<Jugadores>jugadores;
	
	public AppJugadores() {
		this.jugadores=new ArrayList<Jugadores>();
	}
	
	public ArrayList<Jugadores> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugadores> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "AppJugadores [jugadores=" + jugadores + "]";
	}

	public static void main(String[] args) {
		AppJugadores aj=new AppJugadores();
		
		JSONParser parser=new JSONParser();
		
		Object obj;
		try {
			obj = parser.parse(new FileReader("jugadores.json"));
			JSONArray jugadores=(JSONArray)obj;
			
			for(Object o:jugadores) {
//				System.out.println(o);
				aj.cargarJugadores(o);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Jugadores de Al Nassr");
		aj.jugadores.stream().filter(j->j.getClub().equals("Al Nassr")).forEach(j->System.out.println("\t - "+j.getNombre()));
		
		System.out.println();
		System.out.println("Jugadores delanteros");
		aj.jugadores.stream().filter(j->j.getPosicion().equals("Delantero")).forEach(j->System.out.println("\t - "+j.getNombre()));
		
		System.out.println();
		System.out.println("Jugadores centrocampistas");
		aj.jugadores.stream().filter(j->j.getPosicion().equals("Centrocampista")).forEach(j->System.out.println("\t - "+j.getNombre()));
		
		System.out.println();
		System.out.println("Jugadores Defensa");
		aj.jugadores.stream().filter(j->j.getPosicion().equals("Defensa")).forEach(j->System.out.println("\t - "+j.getNombre()));
		
		System.out.println();
		System.out.println("Jugadores mayores de 30 años");
		aj.jugadores.stream().filter(j->j.getEdad()>30).forEach(j->System.out.println("\t - "+j.getNombre()));
		
		System.out.println();
		System.out.println("Jugadores de Francia");
		aj.jugadores.stream().filter(j->j.getNacionalidad().equals("Francés")).forEach(j->System.out.println("\t - "+j.getNombre()));
	}
	
	private void cargarJugadores(Object o) {
		JSONObject json=(JSONObject)o;
		String club=(String)json.get("club");
		String posicion=(String)json.get("posición");
		String nombre=(String)json.get("nombre");
		String edad=(String)json.get("edad");
		String nacionalidad=(String)json.get("nacionalidad");
		this.getJugadores().add(new Jugadores(nombre, Integer.parseInt(edad), nacionalidad, club, posicion));
	}
}
