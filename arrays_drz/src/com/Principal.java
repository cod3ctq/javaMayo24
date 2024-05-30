package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	
		
		
		
//		int[] f2 = {100,5,3,15,97,23,7};	//estructura estatica 
//		
//		f2[4]=39;
//		f2[6]=8;	// No existe un espacio en la estructura de 
		
//		int[] f1 = new int[10];	//array vacio 
//			System.out.println(f1);
//			f1[0]=40;
//			f1[1]=40;
//			f1[2]=40;	
//			f1[3]=40;
//			f1[4]=40;
//			System.out.println(Arrays.toString(f1));
		
		//Leer el array, y por cada valor:
		  //Si es par, dividirlo entre 3
		  //si no, multiplicarlo por 4
		  //guardar el resultado en la misma posicion donde se esta leyendo
//			if (f2[i] % 2 == 0) {
//				f2[i] = (f2[i] /3);
//			} else {
//				f2[i] = (f2[i] * 4);
//			}
			
		// sumatoria de todos los numero y calcular el promedio 
			
//		int[] f2 = {23,545,245,234,656,22,6,7,9,34,6,867,6,9,969,23};
//		double promedio=0;
//		int suma=0;
//		
//				
//				System.out.println(Arrays.toString(f2));
//			
//			for (int i = 0; i < f2.length; i++) {
//				suma= suma + f2 [i];
//				
//					}
//				promedio= suma / f2.length;
//				
//					System.out.println("La suma de los valores del el arreglo es de: " + suma);
//					System.out.println("El promedio es de: " + promedio);
	
	public static void main(String[] args) {
		String nombre;
		
		
			Scanner sc = new Scanner(System.in);
				System.out.println("Ingresa nombre completo");

					nombre = sc.nextLine(); 
					nombre = nombre.toLowerCase();
					int tamaño = nombre.length();
					String[] valores = new String[tamaño];
					String f2 = "";
					
					for(int k=0; k<tamaño; k++) {
						valores [k] = Character.toString(nombre.charAt(k)); //llena el arreglo con las letras de el nombre que se ingresa
						
					}
					System.out.println(Arrays.toString(valores)); // se imprime el nombre en el arreglo 
			String[]abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; // lo 	que se va a comparar con la variable osea el nombre
				
				for(int j=0; j<valores.length; j++) {  //compara el nombre con el abecedario 
				
					String aux= valores[j]; // iguala el resultado de mi nombre a nueva variable 
						
						
							if(aux.equals("z")) {   //si mi variable anterior (nombre) es igual a la letra z
								f2 = f2 + "a"; //entonces si mi nombre tiene letra z lo sustituye con la a 
								
							
							} else if(aux.equals("")){ //entonces si mi variable (nombre) recibe un espacion en blanco 
								f2 += "-"; // lo sustituye con un guion
								
							} else { // si el valor de de aux no es z ni espacio en blanco 
								for(int z = 0; z<abc.length; z++) { //entonces el for se hace una iteracion/indice en abc
									if(aux.equals(abc[z])) { // se compara el vaor de aux con la letra de abc actual
										f2=f2+abc[z+1]; //Si la comparacion es identica al inidice actual se le suma 1 para pedir la letra que sigue 
									}
								}
							}
							
								}
						System.out.println(f2); //se imprime la variable de mi f2 que es el string que llamamos para el resultado 
							}
				}
					
						
						
					
				
					
							
						

				
	
	
	
	

