package comm;

public class Ram {
	
		
		String marca;
		String tecnologia;
		int capacidad;
		int frecuencia;
		
		public Ram(String marca, String tecnologia, int capacidad, int frecuencia) {
			super();
			this.marca = marca;
			this.tecnologia = tecnologia;
			this.capacidad = capacidad;
			this.frecuencia = frecuencia;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getTecnologia() {
			return tecnologia;
		}

		public void setTecnologia(String tecnologia) {
			this.tecnologia = tecnologia;
		}

		public int getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(int capacidad) {
			this.capacidad = capacidad;
		}

		public int getFrecuencia() {
			return frecuencia;
		}

		public void setFrecuencia(int frecuencia) {
			this.frecuencia = frecuencia;
		}

		
		@Override
		public String toString() {
			return "Ram [marca=" + marca + ", tecnologia=" + tecnologia + ", capacidad=" + capacidad + ", frecuencia="
					+ frecuencia + "]";
		}
		
		
		
	
}
