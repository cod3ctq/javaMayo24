package com;

public class Principal {

	public static void main(String[] args) {
		
		//crear objeto de la clase
		
		MaquinaEscribir me= new MaquinaEscribir();//primera forma de hacerlo
		
		me.setPrecio(550.25);
		me.setModelo("MarkI");
		me.setMarca("ACME");
		me.setElectronica(true);
		
		
		System.out.println(me); //muestra la direccion de memoria
		
		
		//segunda forma
		MaquinaEscribir me2= new MaquinaEscribir("M2", "Olivetti", 250.25, false);
		System.out.println(me2);
		
		me .leerArchivo("C:\\Users\\super\\OneDrive\\Escritorio\\tectroprueba.txt");
		
		//me.escribir("C:\\\\Users\\\\super\\\\OneDrive\\\\Escritorio\\\\tectroprueba.txt", "ESTO ES UN NUEVO TEXTO DEL ARCHIVO");
		//me .leerArchivo("C:\\Users\\super\\OneDrive\\Escritorio\\tectroprueba.txt");
	}
	
	
}
