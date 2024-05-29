package com;

public class Memoria {

	String marca;
	double capacidad;
	String tipo;
		
		public Memoria() {
			
		}

		public Memoria(String marca, double capacidad, String tipo) {
			super();
			this.marca = marca;
			this.capacidad = capacidad;
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(double capacidad) {
			this.capacidad = capacidad;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return "Memoria [marca=" + marca + ", capacidad=" + capacidad + ", tipo=" + tipo + "]";
		}
		
			
	
	
}
