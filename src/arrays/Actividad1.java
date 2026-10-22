package arrays;

import java.util.Arrays;

public class Actividad1 {

	public static void main(String[] args) {
		int[] naleatorio = new int[20];
		for (int i = 0; i < naleatorio.length; i++) {
			naleatorio[i] = (int) (1 + Math.random() * 50);
		}
		for (int i = 0; i < naleatorio.length; i++) 
			System.out.print((naleatorio[i]) + " ");
			System.out.println();
		for (int i = naleatorio.length - 1; i >= 0; i--) {
				System.out.print((naleatorio[i]) + " ");
			}
		}

	}
