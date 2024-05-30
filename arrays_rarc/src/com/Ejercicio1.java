package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		/*
		 * CODIGO PARA INGRESAR UN NOMBRE Y QUE TE REGRESE LA POSICION DE LA LETRA EN EL
		 * ABECEDARIO String n;
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Ingresa tu nombre:"); n = sc.nextLine(); n =
		 * n.toLowerCase(); int t = n.length(); String [] f1 = new String[t];
		 * 
		 * for(int h = 0; h<t; h++) {
		 * 
		 * f1 [h] = Character.toString(n.charAt(h)); }
		 * System.out.println(Arrays.toString(f1)); String[] abc =
		 * {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r",
		 * "s","t","u","v","w","x","y","z"};
		 * 
		 * for(int l = 0; l<f1.length; l++) {
		 * 
		 * String aux=f1[l]; for(int z=0; z<abc.length; z++) {
		 * 
		 * if(aux.equals(abc[z])) { System.out.println(z+1);
		 * 
		 * } } }
		 */

		// ---------------------------------------------------------------------------

		String n;
		String f2 = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa tu nombre:");
		n = sc.nextLine(); // ingreso el nombre
		n = n.toLowerCase(); //lo convierto a minusculas
		int t = n.length(); // le doy el tamaño proporcional al nombre que se ingreso
		String[] f1 = new String[t]; // creo el array con los espacios segun el tamaño del nombre

		for (int h = 0; h < t; h++) { // iterar sobre la array vacio para llenrlo con los caracteres del string

			f1[h] = Character.toString(n.charAt(h)); //llena el array con las letras del nombre
		}
		System.out.println(Arrays.toString(f1)); // imprimo la array con el nombre
		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" }; // con lo que va a comparar mi f1

		for (int l = 0; l < f1.length; l++) { //compara el f1 con el abc

			String aux = f1[l]; //igualo el resultado de f1 a una nueva variable
			if (aux.equals("z")) { //si mi variable anterior es igual a la letra Z
				f2 = f2 + "a";   //entonces va a mostras la letra A
			} else if (aux.equals(" ")) { //entonces si mi variable que esta igualada a f1 recibe un espacio en blanco
				f2 += "-";      //lo va a sustituir con un guion -
			} else {   //si el vvalor de aux no es z ni espacio en blanco

				for (int z = 0; z < abc.length; z++) {//entonces en el for se hace una iteracion sobre el abc

					if (aux.equals(abc[z])) { //se compara el valor de aux con la letra actual del abc
						f2 = f2 + abc[z + 1]; //si son iguales al indice acutal se le suma 1 para pedir la letra siguiente

					}
				}

			}
		}
		System.out.println(f2); //Imprimo la varaible f2
	}

}
