package com;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		
		
		int [][] matriz = new int [4][5];  
	
		System.out.println(matriz);
		
		System.out.println(Arrays.deepToString(matriz));
		
		
		
		
//		int[][] matriz2 = {{1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}, {99, 88, 77, 66, 55}};
		
		int[][] matriz2 = {{1, 2, 3,},
						  {10, 20,}, 
						  {60, 70, 80, 90,},
						  {99},
						  {99, 88, 77, 66, 55, 29, 18}};
		
		//iterar sobre las filas 
			for(int i = 0; i <matriz2.length; i++) {
				//System.out.println(Arrays.toString(matriz2[i]));
				
				//itera sobre columnas 
				for(int j = 0; j <matriz2[i].length; j++) {
					System.out.println("Fila " + i + " Columna " + j + " : " + matriz2[i][j]);   // si la matriz es irregular es indispensable asegurar que a cada fila se le pegunta su longitud particular
					
				}
			}
		

		
		
//		matriz[0][1] = 4;  //cambia el valor en la fila 0, columna 1 a 4
//		int x = matriz[2][2]; //guarda el valor de la fila 2, columna 2 en la variable x
//			
		
	}
	
		
	
}
