package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//QUE Y COMO
public class MaquinaEscribir {

	/*
	 * PILARES DE LA ORIENTACION DE OBJETOS herencia encapsulamiento abstraccion
	 * polimorfismo
	 * 
	 */
	// ATRIBUTOS
	//Private: solo se puede acceder a ellos con get y set
	//Protected: se puede acceder a ellos desde el interior de la clase y desde clases del mismo paquete
	//Public
	
	private String modelo;
	private String marca;
	protected double precio;
	protected boolean electronica;
	public int cantidadhojas;

	// metodos constructores
	public MaquinaEscribir() {

	}

// FORMA : Cantidad, Orden y Tipos de datos de cada argumento
	public MaquinaEscribir(String modelo, String marca, double precio, boolean electronica) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.electronica = electronica;
	}

	// Getters es para recuperar los valores dentro de los objetos
	// Setter es para establecer un valor al interior de los objetos
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
	public String toString() { // sirve para poder observar el interioir de un objeto y los valores de sus
								// atributos
		return "MaquinaEscribir [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", electronica="
				+ electronica + "]";
	}

	// Comportamiento
	// 1.- Metodos Nativos
	// 2.- Metodos Heredados (comunmente se sobrescriben)
	// 3.- Metodos Implementados (traidos de interfaces)

	public void leerArchivo(String ruta) {
		String linea = "";
		File file = new File(ruta); //carga la ubicacion del archivo
		
		try { //intenta hacer lo siguiente
			FileReader fr = new FileReader(file);  //crear un cache
			BufferedReader br = new BufferedReader(fr); //accede y lee el cache
			
			while ((linea = br.readLine()) != null)
			{
				System.out.println(linea);
			}

		} catch (Exception ex) { //Atrapa el error para seguir con el codigo
			ex.printStackTrace();
			
			System.out.println("Hola, estoy haciendo otra cosa aunque ya valio");
		}
	}
	public void escribir(String ruta, String mensaje) {
		File file = new File(ruta);
		try {
			//false = sobreescribe todo el archivo  |
			//true = le agrega                      v
			FileWriter fw = new FileWriter(file, false);
			fw.write(mensaje);
			fw.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
