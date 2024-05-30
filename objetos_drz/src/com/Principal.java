package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear un objeto de la clase 
		
		
		Maquinadeescribir me = new Maquinadeescribir();
		
			me.setPrecio(867.50);
			me.setModelo("Mark1");
			me.setMarca("ACME");
			me.setElectronica(true);
			me.
			
				System.out.println(me); //Estado de el objeto, valores de los atributos, etc 
				
		Maquinadeescribir me2 = new Maquinadeescribir("M2", "Olivetti", 222.33, false);
			System.out.println(me2);
			
			
			
			
			me.leerArchivo("C:\\Users\\Daniel\\Desktop\\Maquina.txt");
			
			//me.escribir("C:\\Users\\Daniel\\Desktop\\Maquina.txt", "HOLA ARCHIVO DEFINITIVO");
			
			//me.leerArchivo("C:\\Users\\Daniel\\Desktop\\Maquina.txt");
			
			Pantalla pantalla = new Pantalla("24 Pulgadas", "LED", 1080);
			Almacenamiento alma = new Almacenamiento("HyperX", "RAM", 16);
			Memoria memoria = new Memoria("HyperX", 16, "DDR3");
			Procesador procesa = new Procesador("RyzenPro8", "Laptop Y Desktops", 8);
			
			
			
			
			Computadora compu = new Computadora("DELLi24", "DELL", 5500, false, pantalla, alma, memoria, procesa);
			
			
			System.out.println(compu);
			
	}
	
}
