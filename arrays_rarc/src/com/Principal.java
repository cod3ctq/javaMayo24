package com;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
	
		int[] f1 = new int[10];
		
		System.out.println(f1[5]);
		f1[0] = 10;
		f1[1] = 80;
		f1[2] = 40;
		f1[3] = 2;
		f1[4] = 12;
		
		System.out.println(Arrays.toString(f1));
		
		Double s=0.0;
		Double p=0.0;
		int [] f2 = {23,545,245,234,656,22,6,7,9,34,6,687,6,9,969,23};
		
		System.out.println(Arrays.toString(f2));
		
	 	//Leer el array, y por cada valor:
		  //Si es par, dividirlo entre 3
		  //si no, multiplicarlo por 4
		  //guardar el resultado en la misma posicion donde se esta leyendo
		
		//sumar todos los valores del Array y hacer un promedio
	for (int i = 0; i < f2.length; i++) {
		System.out.println(f2[i]);
//			
//		if(f2[i] % 2 == 0) {
//			f2[i] = (f2[i] / 3);
//		}else {
//			f2[i] = (f2[i] * 4);
//		}
	
		s=s+f2[i];
		
		
	}
	p=s/f2.length;
		System.out.println(Arrays.toString(f2)); 
	
	System.out.println("La suma de la Array es:"+s);
	System.out.println("El promerio seria: "+p);
	
					}
		
		
	}


