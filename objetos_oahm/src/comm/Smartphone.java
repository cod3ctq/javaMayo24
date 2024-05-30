package comm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Smartphone extends Laptops {

	String compania;

	public Smartphone(String marca, String modelo, double precio, Almacenamiento alm, Procesador procesador, Ram ram,
			boolean grafica, String compania) {
		super(marca, modelo, precio, alm, procesador, ram, grafica);
		this.compania = compania;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Smartphone [compania=" + compania + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", alm=" + alm + ", procesador=" + procesador + ", ram=" + ram + ", grafica=" + grafica + "]";
	}
	
	@Override
	public void leerArchivo(String ruta) {
		String linea = "";
		File file = new File(ruta);//carga la ubicacion del archivo

		try {
			FileReader fr = new FileReader(file);//crea un cache
			BufferedReader br = new BufferedReader(fr);//accede y lee el cache
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("estoy haciendo otra cosa aunque ya fue.");
		}

	}

}
