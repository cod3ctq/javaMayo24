package com;

public class Procesador {

		String serie;
		String formato;
		int Nucleos;
		
			public Procesador() {
				
			}

			public Procesador(String serie, String formato, int nucleos) {
				super();
				this.serie = serie;
				this.formato = formato;
				Nucleos = nucleos;
			}

			public String getSerie() {
				return serie;
			}

			public void setSerie(String serie) {
				this.serie = serie;
			}

			public String getFormato() {
				return formato;
			}

			public void setFormato(String formato) {
				this.formato = formato;
			}

			public int getNucleos() {
				return Nucleos;
			}

			public void setNucleos(int nucleos) {
				Nucleos = nucleos;
			}

			@Override
			public String toString() {
				return "Procesador [serie=" + serie + ", formato=" + formato + ", Nucleos=" + Nucleos + "]";
			}
				
			
				
	
	
}
