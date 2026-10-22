package trabajadores;

public class App {
	public static void main(String[] args) {
		Trabajador[]mistrabajadores=new Trabajador[4];
		
		//Cargar los datos
		Empleado e=new Empleado("Carlos", "Programador", "258258", "4567", 20000);
		Consultor c=new Consultor("Paco", "Desarrollador", "654789", "56546456", 35, 20);
		Consultor c1=new Consultor("Juan", "DAW", "5685415", "5621656", 35, 32);
		Consultor c2=new Consultor("Jimena", "ASIR", "415889", "01546456", 35, 13);
		
		mistrabajadores[0]=e;
		mistrabajadores[1]=c;
		mistrabajadores[2]=c1;
		mistrabajadores[3]=c2;
		
		for(int i=0; i<mistrabajadores.length;i++) {
			System.out.println(mistrabajadores[i].getNombre()+" que trabaja de "+mistrabajadores[i].getPuesto()
					+" cobrará "+mistrabajadores[i].calcularPaga()+"€");
			System.out.println(mistrabajadores[i]);
		}
	}
}
