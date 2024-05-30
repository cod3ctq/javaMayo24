package com;

public class Principaldos {

	public static void main(String[] args) {
		
	
			Camiseta me = new Camiseta();
			
				me.setTalla("Grande");
				me.setModelo("Box Fit");
				me.setMarca("CrimenLife");
				me.setColor("Negro/Blanco");
				me.setPrecio(750.50);
				
				System.out.println(me);
			
			Camiseta me2 = new Camiseta("Grande", "Box Fit", "CrimenLife", "Negro/Blanco", 750.50);
			System.out.println(me2);
		
		}
	
	
	
}
