package com;

import java.util.Arrays;

public class com {
	public static void main(String[] args) {
		int[] f2 = { 23, 545, 245, 234, 656, 22, 6, 7, 9, 34, 6, 867, 6, 9, 969, 23 };
		System.out.println(Arrays.toString(f2));
		int suma = 0;
		int promedio = 0;
		
		
		for (int i = 0; i < f2.length; i++) {
						
			suma = suma + f2[i];
			
			
	//			
//			if (f2[i] % 2 == 0) {
//				f2[i] = f2[i] / 3;
//			} else {
//				f2[i] = f2[i] * 4;
//				System.out.println(f2[i]);

			}
		promedio =  suma /f2.length; 
		System.out.println("tu suma es " + suma);
		System.out.println("tu promedio es " + promedio);
		}

	}

//Leer el array, y por cada valor:
//Si es par, dividirlo entre 3
//si no, multiplicarlo por 4
//guardar el resultado en la misma posicion donde se esta leyendo
//int[] f2 = {23,545,245,234,656,22,6,7,9,34,6,867,6,9,969,23};