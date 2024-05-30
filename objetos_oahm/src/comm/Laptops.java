package comm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public final class Laptops {

	 String marca;
	 String modelo;
	 double precio;
	 Almacenamiento alm;
	Procesador procesador;
	Ram ram;
	boolean grafica;
	public int cantidadHojas;

	public Laptops() {

	}

	public Laptops(String marca, String modelo, double precio, Almacenamiento alm, Procesador procesador, Ram ram,
			boolean grafica) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.alm = alm;
		this.procesador = procesador;
		this.ram = ram;
		this.grafica = grafica;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public boolean isGrafica() {
		return grafica;
	}

	public void setGrafica(boolean grafica) {
		this.grafica = grafica;
	}

	@Override
	public String toString() {
		return "Laptops [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", alm=" + alm
				+ ", procesador=" + procesador + ", ram=" + ram + ", grafica=" + grafica + "]";

	}

	public  void leerArchivo(String ruta) {
		String linea = "";
		File file = new File(ruta);// carga la ubicacion del archivo

		try {
			FileReader fr = new FileReader(file);// crea un cache
			BufferedReader br = new BufferedReader(fr);// accede y lee el cache
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("estoy haciendo otra cosa aunque ya fue.");
		}

	}

}
