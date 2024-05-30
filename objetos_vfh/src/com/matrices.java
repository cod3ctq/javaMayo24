package com;

import java.util.Arrays;

public class matrices {
	public static void main(String[] args) {
		//matrices
		int[][] m1 = new int[4][5];
		System.out.println(m1);
		// lo siguient del deep es porque es de matrices, sino nomás es a to string
		
		System.out.println(Arrays.deepToString(m1));
		int[][] m2 = {{1,2,3,4,5},
		          {10,20,30,40,50},
		          {60,70,80,90,100},
		          {99,88,77,66,55}};
		
		// Iterar sobre las filas
		for (int i = 0; i<m2.length; i++) {
//			System.out.println(Arrays.toString(m2[i]));

//			Para apuntar a un valor en especifico se necesita otro ciclo, 
			//el siguiente va a iterar sobre columnas
			 
			for (int j=0; j<m2[i].length; j++) {
				System.out.println("fila: " +i+ " columna: "+j+ " :" +m2[i][j]);
			//si la matriz es irregular es indispensable asegurarse que 
				//a cada fila se le pregunte su longitud particular[i].
			
			}
		}
		
		
	}
}
