package com;

public class Procesador {
	
	//Atributos
	
	int numerodenucleos;
	int memoriacache;
	String marca;
	String modelo;

	public Procesador () {
		
	}

	public Procesador(int numerodenucleos, int memoriacache, String marca, String modelo) {
		super();
		this.numerodenucleos = numerodenucleos;
		this.memoriacache = memoriacache;
		this.marca = marca;
		this.modelo = modelo;
	}

	public int getNumerodenucleos() {
		return numerodenucleos;
	}

	public void setNumerodenucleos(int numerodenucleos) {
		this.numerodenucleos = numerodenucleos;
	}

	public int getMemoriacache() {
		return memoriacache;
	}

	public void setMemoriacache(int memoriacache) {
		this.memoriacache = memoriacache;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Procesador [numerodenucleos=" + numerodenucleos + ", memoriacache=" + memoriacache + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}
	
}
