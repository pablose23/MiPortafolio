package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
	private ArrayList<Actor>actores;

	public App() {
		this.actores = new ArrayList<Actor>();
	}

	public ArrayList<Actor> getActores() {
		return actores;
	}

	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}

	@Override
	public String toString() {
		return "App [actores=" + actores + "]";
	}
	
	public static void main(String[] args) {
		App a1=new App();
		
		JSONParser parser=new JSONParser();
		
		try {
			Object obj=parser.parse(new FileReader("actores.json"));
			JSONArray actores=(JSONArray)obj;
			
			for(Object o: actores) {
//				System.out.println(o);
				a1.cargarActores(o);
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
		
//		Con Stream():
		System.out.println("Actores de EEUU");
		a1.actores.stream().filter(a->a.getPais().equals("EEUU")).forEach(a->System.out.println("\t - "+a.getNombre()+" "+a.getApellido()));
		long total=a1.actores.stream().filter(a->a.getPais().equals("EEUU")).count();
		System.out.println("Total: "+total+" Actores de EEUU");
		
		System.out.println();
		System.out.println("Actores de Escocia");
		a1.actores.stream().filter(a->a.getPais().equals("Escocia")).forEach(a->System.out.println("\t - "+a.getNombre()+" "+a.getApellido()));
		long totale=a1.actores.stream().filter(a->a.getPais().equals("Escocia")).count();
		System.out.println("Total: "+totale+" Actores de Escocia");
		
		System.out.println();
		System.out.println("Actores de Gales");
		a1.actores.stream().filter(a->a.getPais().equals("Gales")).forEach(a->System.out.println("\t - "+a.getNombre()+" "+a.getApellido()));
		long totalg=a1.actores.stream().filter(a->a.getPais().equals("Gales")).count();
		System.out.println("Total: "+totalg+" Actores de Gales");
		
		System.out.println();
		System.out.println("Actores de Inglaterra");
		a1.actores.stream().filter(a->a.getPais().equals("Inglaterra")).forEach(a->System.out.println("\t - "+a.getNombre()+" "+a.getApellido()));
		long totali=a1.actores.stream().filter(a->a.getPais().equals("Inglaterra")).count();
		System.out.println("Total: "+totali+" Actores de Inglaterra");
		
//		Con Bucles:
//		System.out.println("Actores de EEUU");
//		for (Actor ac : a.getActores()) {
////			System.out.println(ac.getNombre()+" "+ac.getApellido()+" "+ac.getPais());
//			if(ac.getPais().equals("EEUU")) {
//				System.out.println("\t -"+ac.getNombre()+" "+ac.getApellido());
//				total++;
//			}
//		}
//		System.out.println("Total "+total);
//		
//		System.out.println();
//		
//		System.out.println("Actores de Escocia");
//		for (Actor ac : a.getActores()) {
////			System.out.println(ac.getNombre()+" "+ac.getApellido()+" "+ac.getPais());
//			if(ac.getPais().equals("Escocia")) {
//				System.out.println("\t -"+ac.getNombre()+" "+ac.getApellido());
//				totale++;
//			}
//		}
//		System.out.println("Total "+totale);
//		
//		System.out.println();
//		
//		System.out.println("Actores de Gales");
//		for (Actor ac : a.getActores()) {
////			System.out.println(ac.getNombre()+" "+ac.getApellido()+" "+ac.getPais());
//			if(ac.getPais().equals("Gales")) {
//				System.out.println("\t -"+ac.getNombre()+" "+ac.getApellido());
//				totalg++;
//			}
//		}
//		System.out.println("Total "+totalg);
//		
//		System.out.println();
//		
//		System.out.println("Actores de Inglaterra");
//		for (Actor ac : a.getActores()) {
////			System.out.println(ac.getNombre()+" "+ac.getApellido()+" "+ac.getPais());
//			if(ac.getPais().equals("Inglaterra")) {
//				System.out.println("\t -"+ac.getNombre()+" "+ac.getApellido());
//				totali++;
//			}
//		}
//		System.out.println("Total "+totali);
	}
	private void cargarActores(Object o) {
		JSONObject json=(JSONObject)o;
		String nombre=(String)json.get("first_name");
		String apellido=(String)json.get("last_name");
		String edad=(String)json.get("age");
		String peliculas=(String)json.get("movies");
		String pais=(String)json.get("country");
		this.getActores().add(new Actor(nombre, apellido, Integer.parseInt(edad), peliculas, pais));
	}

}
