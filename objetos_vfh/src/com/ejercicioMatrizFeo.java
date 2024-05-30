}package com;

import java.util.Arrays;

public class ejercicioMatrizFeo {
	public static void main(String[] args) {
		String index = "1234567890";

		String[][] m1 = { { "1", "v", "3", "4" }, { "1", "2", "i", "4" }, { "1", "c", "3", "4" },
				{ "t", "2", "r", "4" }, { "1", "f", "3", "4" } };
		System.out.println("Tu primer matriz es " + Arrays.deepToString(m1));
		String[][] m2 = { { "1", "2", "3", "4" }, { "1", "l", "3", "4" }, { "r", "2", "3", "o" },
				{ "l", "s", "3", "4" }, { "1", "2", "e", "4" } };
		System.out.println("Tu segunda matriz es " + Arrays.deepToString(m2));

		String[][] m3 = new String[5][4];

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {

				if (index.indexOf(m1[i][j]) >= 0 && index.indexOf(m2[i][j]) >= 0) {
					int suma = Integer.parseInt(m1[i][j]) + Integer.parseInt(m2[i][j]); // el intergente es para pasar de un string a un int
					m3[i][j] = Integer.toString(suma);
				} else {
					m3[i][j] = "0";
					
					// Si el indice del elemento actual de la matriz 1 es mayor o igual a cero dentro de los números
					//y el indice del elemento actual de la matriz 2 es mayor o igual a cero dentro de los números, entonces ambos son número.
					// 
				}
			}
		}

		System.out.println("\n\nLa matriz resultante es " + Arrays.deepToString(m3));

		for (int fila = 0; fila < m3.length; fila++) {
			for (int columna = 0; columna < m3[fila].length; columna++) {

				System.out.println("\nfila: " + fila + " columna: " + columna + " = " + m3[fila][columna]);
			}

		}
	}
}

//						
//						.equals()
//						|| m2[i][j]); 
//					

//		
//
//		int[][] m2 = {{1,2,3,4,5},
//		          {10,20,30,40,50},
//		          {60,70,80,90,100},
//		          {99,88,77,66,55}};
//		for (int i = 0; i<m2.length; i++) {
//
//			for (int j=0; j<m2[i].length; j++) {
//				System.out.println("fila: " +i+ " columna: "+j+ " :" +m2[i][j]);
