package comm;

public class Almacenamiento {

	String marca;
	String forma; //hdd,ssd, hybrid.
	int capacidad;
	
	public Almacenamiento(String marca, String forma, int capacidad) {
		super();
		this.marca = marca;
		this.forma = forma;
		this.capacidad = capacidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", forma=" + forma + ", capacidad=" + capacidad + "]";
	}
	
	
	
	
	
}
