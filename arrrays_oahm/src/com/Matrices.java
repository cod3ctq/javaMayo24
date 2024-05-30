package com;

import java.util.Arrays;

public class Matrices {
	public static void main(String[] args) {
		
		//matrices
		
		int[][] m1= new int [4][5];
		System.out.println(Arrays.deepToString(m1));
		
		int[][] m2 = {{1,2,3},
				{10,20},
				{60,70,80,90},{99},{99,88,77,66,55,29,18}};
		//nota: si la matriz es indespensable asegurarse que a cada fila se le pregunta
		//su longitud particular.
		
		
		
		//en ambos for la variable entera sera menor a la longitud de las filas y de las columnas
		//para que si la matriz es irregular no exista problema.
		
		
		for (int i = 0; i < m2.length; i++) { //itera sobre las filas
			//System.out.println(Arrays.toString(m2[i]));
			
			for (int j = 0; j < m2[i].length; j++) { //itera sobre las columnas
				System.out.println("Fila: "+i+" columna: "+j+" : "+m2[i][j]);
			}
			
		}
		
		
		
		
		
	}
}
