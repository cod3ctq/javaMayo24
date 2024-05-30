package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Computadora extends MaquinaEscribir{
	Pantalla pantalla;
	Almacenamiento alm;
	Memoria m;
	Procesador pro;
	
	public Computadora() {
	}

	public Computadora(String modelo, String marca, double precio, boolean electronica, Pantalla pantalla,
			Almacenamiento alm, Memoria m, Procesador pro) {
		super(modelo, marca, precio, electronica);
		this.pantalla = pantalla;
		this.alm = alm;
		this.m = m;
		this.pro = pro;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public Memoria getM() {
		return m;
	}

	public void setM(Memoria m) {
		this.m = m;
	}

	public Procesador getPro() {
		return pro;
	}

	public void setPro(Procesador pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "Computadora [pantalla=" + pantalla + ", alm=" + alm + ", m=" + m + ", pro=" + pro + "]";
	}
	
	@Override
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
	

	
	
	
	
	
	
}
