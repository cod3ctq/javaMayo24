package com;

public class Telefono {

	// Atributos
	String color;
	String marca;
	int modelo;
	int capacidad;
	double precio;

	// Metodo Constructor
	public Telefono() {
	}

	// Generar constructor
	// Forma: Cantidad, orden y tipos de datos de cada argumento
	// (clic derecho->Source->Generar constructor usando los atributos)

	public Telefono(String color, String marca, int modelo, int capacidad, double precio) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	//Observo el interior de un objeto y los valores de sus atributos
	//Clic derecho->Source->Generar toString
	@Override
	public String toString() { 
		return "Telefono [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad
				+ ", precio=" + precio + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
