package com;

import java.util.Arrays;

public class Ejercicio2matrices {
	public static void main(String[] args) {
		int suma;
		int a;
		int b;
		String numeros = "1234567890";
		// Declarar las matrices que vamos a utilizar
		//                       "x" y "y"
		String[][] m0 = new String[5][4]; //Declara una matriz de 5*4  pero sin valores

		String[][] m1 = { { "7", "f", "5", "x" }, { "8", "3", "2", "k" }, { "9", "y", "l", "6" },
				{ "c", "8", "x", "4" }, { "d", "1", "6", "0" } }; //Declaro una matriz de 5*4 pero con valores asignados

		String[][] m2 = { { "5", "ñ,", "1", "z" }, { "j", "f", "8", "7" }, { "5", "v", "u", "c" },
				{ "m", "6", "1", "2" }, { "w", "y", "e", "9" } }; //Declaro una matriiz de 5*4 pero con valores asignados


		
		
		for (int i = 0; i < m1.length; i++) { //Itera las filas de la primera matriz
	
			for (int j = 0; j < m1[i].length; j++) { //Itera las columnas de la primera matriz
			if((numeros.indexOf(m1[i][j])>=0 && (numeros.indexOf(m2[i][j])) >=0)) { 
					//Sí el indice de elemento actual de la matriz 1 es mayor o igual a 0 dentro de los numeros y 
					// el indice del elemento actual es mayor o igual a 0 dentro de los numeros, entonces ambos son numeros
					a = Integer.parseInt(m1[i][j]); //convertimos de string a int
					b = Integer.parseInt(m2[i][j]);
					
					suma = a + b;
					
					m0[i][j]=Integer.toString(suma); //almacenamos el resultado de la suma y la convertimos de int a string
				}else {
					m0[i][j] = "0"; //si no se cumple lo anteoir el resultado seria 0
				} 

				
/*				try {
					a = Integer.parseInt(m1[i][j]); //convertimos de string a int
					b = Integer.parseInt(m2[i][j]);
					
					suma = a + b;
					
					m0[i][j]=Integer.toString(suma);
					
				}catch(Exception e) {
					e.printStackTrace();
					m0[i][j] = "0";
					System.out.println("Hola");
				}
				
			} */
			}
			}
		System.out.println(Arrays.deepToString(m0)); //Imprimimos la matriz que llenamos con los resultados de la suma
	}
}
