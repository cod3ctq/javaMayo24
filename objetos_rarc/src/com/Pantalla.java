package com;

public class Pantalla {

	// Atributos
	int resolucion;
	int tamaño;
	String tecnologia;

	public Pantalla() {
	}

	public Pantalla(int resolucion, int tamaño, String tecnologia) {
		super();
		this.resolucion = resolucion;
		this.tamaño = tamaño;
		this.tecnologia = tecnologia;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", tamaño=" + tamaño + ", tecnologia=" + tecnologia + "]";
	}
	
}
