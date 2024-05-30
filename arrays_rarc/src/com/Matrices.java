package com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Matrices {
	public static void main(String[] args) {

		// Matrices
		int[][] m1 = new int[4][5];
		System.out.println(m1);
		System.out.println(Arrays.deepToString(m1));

		// si la matris es irregular es indispensable asegurarse que a cada fila se le
		// pregunta su longitud particular
		int[][] m2 = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 99, 88, 77, 66, 44, 55 } };

		// Iterar sobre filas
		for (int i = 0; i < m2.length; i++) {
			// System.out.println(Array.(m2[i]));

			// Iterar sobre columnas
			for (int j = 0; j < m2[i].length; j++) {
				System.out.println("Fila: " + i + "Columna: " + j + " :" + m2[i][j]);
			//Para cualquier manipulacion o  de la matris se tiene que realizar desde el For mas anidado
			
			}
		}

	}

}
