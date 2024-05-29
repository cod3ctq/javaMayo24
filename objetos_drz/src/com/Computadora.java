package com;

import java.io.File;

public class Computadora extends Maquinadeescribir {

		Pantalla pantalla;
		Almacenamiento almacenamiento;
		Memoria memori;
		Procesador procesador;
		
		
		
			public Computadora() {
				
			}



			public Computadora(String modelo, String marca, double precio, boolean electronica, Pantalla pantalla,
					Almacenamiento almacenamiento, Memoria memori, Procesador procesador) {
				super(modelo, marca, precio, electronica);
				this.pantalla = pantalla;
				this.almacenamiento = almacenamiento;
				this.memori = memori;
				this.procesador = procesador;
			}



			public Pantalla getPantalla() {
				return pantalla;
			}



			public void setPantalla(Pantalla pantalla) {
				this.pantalla = pantalla;
			}



			public Almacenamiento getAlmacenamiento() {
				return almacenamiento;
			}



			public void setAlmacenamiento(Almacenamiento almacenamiento) {
				this.almacenamiento = almacenamiento;
			}



			public Memoria getMemori() {
				return memori;
			}



			public void setMemori(Memoria memori) {
				this.memori = memori;
			}



			public Procesador getProcesador() {
				return procesador;
			}



			public void setProcesador(Procesador procesador) {
				this.procesador = procesador;
			}



			@Override
			public String toString() {
				return "Computadora [pantalla=" + pantalla + ", almacenamiento=" + almacenamiento + ", memori=" + memori
						+ ", procesador=" + procesador + "]";
			}

			
			@Override
			public void leerArchivo(String ruta) {
				
				String linea="";
				File file = new File(ruta);
					
					
				
			
			

			
			
		
		
			}	
	
}
