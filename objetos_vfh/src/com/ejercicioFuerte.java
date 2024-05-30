package com;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioFuerte {
	public static void main(String[] args) {

		String n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa tu nombre:");
		n = sc.nextLine();
		n = n.toLowerCase();
		int t = n.length();
		String[] f1 = new String[t];
		String f2 = "";

		for (int h = 0; h < t; h++) {

			f1[h] = Character.toString(n.charAt(h));
		}
		System.out.println(Arrays.toString(f1));
		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		for (int l = 0; l < f1.length; l++) {

			String aux = f1[l];
			
			
			if (aux.equals("z")) {
					f2 = f2 + "a";

				} else if (aux.equals(" ")) {
					f2 += "_";
				}

				else {
					for (int z = 0; z < abc.length; z++) {

						if (aux.equals(abc[z])) {

							f2 = f2 + abc[z + 1];

							
						}
					}

				}

			}
			System.out.println(f2);
		}
	}
