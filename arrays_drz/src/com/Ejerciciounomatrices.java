package com;

import java.util.Arrays;

public class Ejerciciounomatrices {
	public static void main(String[] args) {
		
		String[][] matriz1 = {{"8", "l","6", "p"},
							  {"5", "i","9", "z"},
		                      {"y", "3","o", "7"},
		                      {"6", "f","m", "8"},
		                      {"v", "4","3", "t"}};

		String[][] matriz2 = {{"4", "ñ","4", "ñ"},
				              {"8", "o","j", "z"},
                              {"u", "7","8", "5"},
                              {"9", "s","3", "h"},
                              {"b", "2","1", "y"}};
		
		String[][] matriz3 = new String[5][4];
		String num="123456789";
		int suma;
		int b;
		int c;
		
		
		
		for(int i = 0; i<matriz1.length; i++) {
				
			for(int j = 0; j<matriz1[i].length; j++) {
					if(num.indexOf(matriz1[i][j])>=0 && num.indexOf(matriz2[i][j]) >= 0) { // si el indice de el elemento actual de la matriz1 es mayor o igual a cero y el indice de el 
						//elemento actual es mayor o igual a cero dentro de los numeros, entonces si es un numero ambos 
						b = Integer.parseInt(matriz1[i][j]); // se genera el almacenamiento de el resultado conviriendo de texto a numero 
						c = Integer.parseInt(matriz2[i][j]);
						
						 
						matriz3[i][j]= Integer.toString(b+c);
						
					} else {
						matriz3[i][j]= "0";
					}
			
			}
			}
			System.out.println(Arrays.deepToString(matriz3));
	}
}