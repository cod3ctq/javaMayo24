package com;

import java.util.Arrays;
import java.util.Iterator;

//hacer que dos matrices sumen el valor en la misma posciion y que se guarde en una nueva matriz
//si el valor en la misma posicion de las primeras dos matrices son numeros, que se sumen y se guarden en la nueva matrix,
//si no, que se ponga un 0.

public class EjercicioMatrices {
	public static void main(String[] args) {

		String numeros = "1234567890";
		
		String [][] a = {
				{"7","f","5","x"},
				{"8","3","2","k"},
				{"2","c","4","a"},
				{"z","4","5","q"},
				{"5","o","l","9"}
				
		};
		
		String [][] b = {
				{"9","3","g","q"},
				{"5","4","z","6"},
				{"3","d","5","b"},
				{"a","5","6","r"},
				{"6","p","m","1"}
		};
		
		String [][] c = new String [5][4];
		
		//iterar filas
		for (int i = 0 ; i <a.length  ; i++) {// como ambas matrices son del mismo tamaño, se iteran ambas
//nota: si amabas matrices fueran diferentes, algebraicamente no se podrian sumar.
			
			
			//itera columnas
			for (int j = 0; j < a[i].length; j++) { 
				if(numeros.indexOf(a[i][j])>=0 && numeros.indexOf(b[i][j])>=0){//Si el indice del elemnto actual dentro de los numeros de la matriz 1 es >=0 y 
					//el indice del elemnto actual de la mtriz 2 es >=0,entonces ambos son numeros.
					
					int i1= Integer.parseInt(a[i][j]); //se convierten a valores string a int.
					int i2= Integer.parseInt(b[i][j]);
					
					int n= i1+i2; //variable que almacena la suma de ambas matrices
					
					c[i][j]=""+n;// aqui en lugar de convertir la variable n en string se concatena la variable int con un stringpara que no salga error.
				}
				else {
					c[i][j]="0"; //si no es un numero, la posicion en la nueva matriz guarda un cero en string
					
				}
			}
		}
		
		System.out.println(Arrays.deepToString(c));//imprime la matriz nueva, que es c.
		
	}
}
