package com;

public class Almacenamiento {
	
	//Atributos
	int capacidad;
	String marca;
	String tipo;
	
	public Almacenamiento() {	
	}

	public Almacenamiento(int capacidad, String marca, String tipo) {
		super();
		this.capacidad = capacidad;
		this.marca = marca;
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Almacenamiento [capacidad=" + capacidad + ", marca=" + marca + ", tipo=" + tipo + "]";
	}
	
	
	

}
