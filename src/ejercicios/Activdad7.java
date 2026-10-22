package ejercicios;

public class Activdad7 {

	public static void main(String[] args) {
	int n1=6;
	int n2=12;
	int n3=2;
	int n4=1;
	float res1=0;
	float res2=0;
	float res3=0;
	float res4=0;
	
	res1=(float)n1+n2/n1*n3-n4;
	res2=(float)(n1+n2)/n1*n3-n4;
	res3=(float)n1+n2/n1*(n3-n4);
	res4=(float)n1+n2/(n1*n3)-n4;
	
	System.out.println("el resultado del ejercicio a. es: "+res1);
	System.out.println("el resultado del ejercicio b. es: "+res2);
	System.out.println("el resultado del ejercicio c. es: "+res3);
	System.out.println("el resultado del ejercicio d. es: "+res4);
	}

}
