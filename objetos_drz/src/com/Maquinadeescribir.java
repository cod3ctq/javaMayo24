package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Maquinadeescribir {

	
	
		/*
		 * Herencia
		 * Encapsulamiento
		 * Abstraccion
		 * Polimorfismo
		 */
		
		//PILARES DE LA ORIENTACION A OBJETOS
		
		
		//crear  modelos agregar comportamientos
		//clase como se comporta 
		//Atributos
	
		
		private String modelo;
		private String marca;
		protected double precio;
		protected boolean electronica;
		public int cantidadhojas;
		
		
		//metodos constructores 
		public Maquinadeescribir() {
			
		}
		
		public Maquinadeescribir(String marca) {
			this.marca = marca;
			
		}

		//Forma: Cantidad, orden y tipos de dato de cada argumento/atributo
		public Maquinadeescribir(String modelo, String marca, double precio, boolean electronica) {
			super();
			this.modelo = modelo;
			this.marca = marca;
			this.precio = precio;
			this.electronica = electronica;
		}

		
			//Setter: establecer valor al interior de los objetos
			//Getter: recuperar valores desde el interior de los objetos 
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public boolean isElectronica() {
			return electronica;
		}

		public void setElectronica(boolean electronica) {
			this.electronica = electronica;
		}

		@Override
		public String toString() {
			return "Maquinadeescribir [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", electronica="
					+ electronica + "]";    //Estado de el objeto, valores de los atributos, etc
			
		}
		
		//comportamiento:
		// 1- Metodos nativos 
		// 2- Metodos  heredados (comunmente se sobrescriben)
		// 3- Metodos implementados (traidos de interfaces)
		
		public void leerArchivo(String ruta) {
			
			String linea="";
			File file = new File(ruta); //carga la ubicacion de el archivo
			
			try {
				FileReader fr = new FileReader(file); //Crear un cache 
				BufferedReader br = new BufferedReader (fr); //Accede y lee el 
				while((linea=br.readLine())!=null) {
					System.out.println(linea);
				}
				
			}catch(Exception ex) {
				ex.printStackTrace();
				
				System.out.println("Hola ya hice algo en el cual valio m");
			}
			
		} 
		
		public void escribir(String ruta, String mensaje) {
			
			File file = new File(ruta);
			
			try {
				FileWriter fw = new FileWriter(file, false); //false sobreescribe (borra y pone algo totalmente nuevo) true
				// sino es ninguno de los 2 se escribe lo que se intancia en el texto
				fw.write(mensaje);
				fw.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
	}
	
	

