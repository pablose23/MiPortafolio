package tipos;

import java.util.ArrayList;
import java.util.Stack;

public class Pila<T> {
	
	ArrayList<T>elementos;
	
	public Pila() {
		this.elementos=new ArrayList<>();
	}
	
	public void push(T el) {
		this.elementos.add(el);
	}
	
	public T pop() throws Exception{
		if(this.elementos.size()>0)
			return this.elementos.removeLast();
		else
			throw new Exception("La pila está vacía");
	}
	
	public void verTope() {
		System.out.println(this.elementos.getLast());
	}
	
	public void imprimir() {
		for(int i=this.elementos.size()-1; i>=0;i--) {
			System.out.println("| "+this.elementos.get(i)+" |");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Pila<String> p=new Pila<>();
		p.push("hola");
		p.push("soy");
		p.push("una");
		p.push("pila");
		
		p.verTope();
		p.imprimir();
		
		
		Pila<Integer>numero=new Pila<>();
		numero.push(4);
		numero.push(6);
		
		numero.imprimir();
		
//		Stack<String> pila=new Stack<>();
//		pila.push("hola");
//		pila.push("soy");
//		pila.push("una");
//		pila.push("pila");
//		
//		System.out.println(pila);
//		System.out.println(pila.peek());
//		
//		for(int i=pila.size()-1; i>=0;i--) {
//			System.out.println(pila.pop());
//		}
	}
}
