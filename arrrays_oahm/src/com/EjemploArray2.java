package com;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArray2 {

	public static void main(String[] args) {
		String n; //guarda el valora del nombre

		Scanner sc = new Scanner(System.in);// se crea el scanner

		System.out.println("Ingresa tu nombre:");
		n = sc.nextLine();
		n = n.toLowerCase(); //convierte el nombre a minusculas
		int t = n.length(); //variable que almacena la longitud del nombre escrito por el usuario
		String[] f1 = new String[t];// se crea el string f1 con el tamaño del nombre
		String f2 = "";

		// almacena el nombre en el vector
		for (int h = 0; h < t; h++) {  //itera sobre el array vacio para llenarlo con los caracteres del string

			f1[h] = Character.toString(n.charAt(h));
		}
		System.out.println(Arrays.toString(f1));//imprime el array con los valores agregados
		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" }; // se crea el array del abecedario

		for (int l = 0; l < f1.length; l++) { // itera sobre el nombre para despues comparar con el array del abecedario

			String aux = f1[l]; //se crea un string que almacene el valor de la posicion de f1
			if (aux.equals("z")) { // si el string aux es igual z
				f2 = f2 + "a";//el string f2 va a ser igual a él mismo mas la letra a(acomulador)
			}
			else if(aux.equals(" ")) {//si no, si aux es igual a un espacio 
				f2 += "_"; // el string f2 acomula el caracter guion bajo
			}
			
			else { //si no es igual a ninguna de las anteriores
				for (int z = 0; z < abc.length; z++) { //empieza a iterar en el array del abecedario

					if (aux.equals(abc[z])) { // si la variable aux es igual a la posicion z del array abc

						f2 = f2 + abc[z + 1];	//f2 es igual a el mismo + la posicion del vector abc sumado mas 1 para que devuelva la siguiente letra en lugar de la original

					}
				}

				

			}

		}
		System.out.println(f2); 
	}
}