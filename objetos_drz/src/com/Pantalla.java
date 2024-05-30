package com;

public class Pantalla {

	String tamaño;
	String tipodepantalla;
	double resolucion;
	
		public Pantalla() {
			
		}

		public Pantalla(String tamaño, String tipodepantalla, double resolucion) {
			super();
			this.tamaño = tamaño;
			this.tipodepantalla = tipodepantalla;
			this.resolucion = resolucion;
		}

		public String getTamaño() {
			return tamaño;
		}

		public void setTamaño(String tamaño) {
			this.tamaño = tamaño;
		}

		public String getTipodepantalla() {
			return tipodepantalla;
		}

		public void setTipodepantalla(String tipodepantalla) {
			this.tipodepantalla = tipodepantalla;
		}

		public double getResolucion() {
			return resolucion;
		}

		public void setResolucion(double resolucion) {
			this.resolucion = resolucion;
		}

		@Override
		public String toString() {
			return "Pantalla [tamaño=" + tamaño + ", tipodepantalla=" + tipodepantalla + ", resolucion=" + resolucion
					+ "]";
		}
		
		
	
	
	
		
}
