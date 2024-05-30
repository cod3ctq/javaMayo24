package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//que y como se comporta
public class MaquinaEscribir {

//	pilares de la poo
//	
//	herencia
//	encapsulamientp
//	abstraccion
//	polimorfismo

	// atributos(es el que)

	String modelo;
	String marca;
	double precio;
	boolean electronica;

	// metodos constructores:define un estado inical de los objetos

	public MaquinaEscribir() { // constructor vacio

	}

	public MaquinaEscribir(String marca) { // tercer constructor(parcial)
		this.marca = marca;
	}

	// constructor con argumentos
	// forma
	public MaquinaEscribir(String modelo, String marca, double precio, boolean electronica) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.electronica = electronica;
	}

//	Getters y setters.
//	Clic derecho, source, generate getters y  setters.
//	Los getters se usan para recuperar los valores desde el interior de los objetos
//	Los setters son para establecer valor al interior de los objetos

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

	@Override // clic derecho,source, generate to string
	// Sirve para poder observar el interior de un objeto y los valores de sus
	// atributos.
	public String toString() {
		return "MaquinaEscribir [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", electronica="
				+ electronica + "]";
	}

	// comportamiento:
	// 1.Metodos nativos
	// 2.metodos hererados(comunmente se sobreescriben)
	// 3.Metodos implementados(traidos de interfaces(coleccion de metodos))

	// metodo nativo 
	
	//(leectura)
	public void leerArchivo(String ruta) {
		String linea = "";
		File file = new File(ruta);//carga la ubicacion del archivo

		try {
			FileReader fr = new FileReader(file);//crea un cache
			BufferedReader br = new BufferedReader(fr);//accede y lee el cache
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("estoy haciendo otra cosa aunque ya fue.");
		}

	}

	//escritura
	public void escribir(String ruta, String mensaje) {
		File file = new File(ruta);
		
		try {
			FileWriter fw = new FileWriter(file);//se le agrega true para mantener la informacion del archivo 
			//sin sobre escribir lo anterior,
			//con false dentro del argumento(el parentesis), sobreesccribe el archivo
			fw.write(mensaje);
			fw.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
