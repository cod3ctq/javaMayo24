package com;

public class Camiseta {

	String talla;
	String modelo;
	String marca;
	String color;
	double precio; 
	
		public Camiseta() {
			
		}
		
		public Camiseta(String talla, String modelo, String marca, String color, double precio) {
			super();
			this.talla = talla;
			this.modelo = modelo;
			this.marca = marca;
			this.color = color;
			this.precio = precio;
		}



		public String getTalla() {
			return talla;
		}



		public void setTalla(String talla) {
			this.talla = talla;
		}



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



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public double getPrecio() {
			return precio;
		}



		public void setPrecio(double precio) {
			this.precio = precio;
		}



		@Override
		public String toString() {
			return "Camiseta [talla=" + talla + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color
					+ ", precio=" + precio + "]";
		}
		
		
		
	
}
