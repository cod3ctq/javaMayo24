package com;

import java.util.Arrays;

public class EjercicioArray {

	
	
	public static void main(String[] args) {
		
//Leer el array, y por cada valor:
  //Si es par, dividirlo entre 3
  //si no, multiplicarlo por 4
  //guardar el resultado en la misma posicion donde se esta leyendo
		
		int[] f1= {23,545,245,234,656,22,6,7,9,34,6,867,6,9,969,23};
		int suma=0;
		double promedio=0;
		System.out.println(Arrays.toString(f1));
		
		
		for (int i = 0; i < f1.length; i++) {
						
			suma= suma +f1[i];
						
//			if (f1[i]%2==0) {
//				f1[i] = (f1[i] / 3);
//			}
//			else {
//				f1[i]= f1[i] * 4;
//			}
		}
		promedio= suma / f1.length;
	
		System.out.println("La suma de los valores del array es de: "+suma);
		System.out.println("El promedio es de : "+promedio);
		
	}
	
}
