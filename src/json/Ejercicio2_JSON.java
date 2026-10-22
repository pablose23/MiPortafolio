package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Ejercicio2_JSON {
	
	public static void main(String[] args) {
		JSONParser parser=new JSONParser();
		int min = 2025;
		
		try {
			Object obj=parser.parse(new FileReader("lenguajes.json"));
			JSONArray lenguajes=(JSONArray)obj;
			
			for(Object o: lenguajes) {
				//System.out.println(o);
				//Hacer un metodo que devuelva la fecha como un número
				
				int fecha=getFecha(o);
				if(fecha<min) {
					min=fecha;
				}
			}
			System.out.println("El lenguaje más antigüo es de "+min);
			
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
	}
	
	private static int getFecha(Object o) {
		JSONObject json=(JSONObject) o;
		String nombre=(String) json.get("name");
		String fecha=(String) json.get("publish_date");
		System.out.println(nombre+" "+fecha);
		return Integer.parseInt(fecha);
	}
}
