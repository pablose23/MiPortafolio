package json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import netscape.javascript.JSObject;

import java.io.*;

public class Ejercicio1_JSON {
	
	public static void main(String[] args) {
		JSONParser parser=new JSONParser();
		
		try {
			Object obj=parser.parse(new FileReader("data.json"));
			JSONObject jsonObj=(JSONObject)obj;
			
			//Obtener los valores del objeto JSON
			String nombre=(String) jsonObj.get("nombre");
			String ciudad=(String) jsonObj.get("ciudad");
			long edad=(long)jsonObj.get("edad");
			
			System.out.println(nombre+" "+ciudad+" "+edad);
			
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
}
