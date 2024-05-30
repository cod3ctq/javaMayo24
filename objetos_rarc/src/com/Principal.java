package com;

public class Principal {
	public static void main(String[] args) {

		// Crear un objeto de la clase
		MaquinaEscribir me = new MaquinaEscribir();

		me.setPrecio(867.50);
		me.setModelo("Mark 15");
		me.setMarca("ACME");
		me.setElectronica(true);
	//	me.marca("Lenovo");
	

		System.out.println(me);

		MaquinaEscribir me2 = new MaquinaEscribir("F15", "Patito", 599.99, false);
//		System.out.println(me2);

		// me.leerArchivo("C:\\Users\\RENE\\Desktop\\CTHB.txt");

		// me.escribir("C:\\Users\\RENE\\Desktop\\CTHB.txt", "ESTE ES UN NUEVO TEXTO
		// DENTRO DEL ARCHIVO");

		// me.leerArchivo("C:\\Users\\RENE\\Desktop\\CTHB.txt");

		Pantalla pantalla = new Pantalla(1080, 16, "HD");
		Almacenamiento alm = new Almacenamiento(4, "Sanzun", "SDD");
		Memoria m = new Memoria(1, "Sanzun", "SDD");
		Procesador pro = new Procesador(5, 950, "Intel", "Lentium");

		Computadora cmdora = new Computadora("Legion", "Lenovo", 22599, true, pantalla, alm, m, pro);
		System.out.println(cmdora);
	}

}
