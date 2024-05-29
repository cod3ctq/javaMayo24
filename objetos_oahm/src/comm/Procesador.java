package comm;

public class Procesador {

	int nucleos;
	double frecuencia;
	int cache;
	String socket;
	public Procesador(int nucleos, double frecuencia, int cache, String socket) {
		super();
		this.nucleos = nucleos;
		this.frecuencia = frecuencia;
		this.cache = cache;
		this.socket = socket;
	}
	public int getNucleos() {
		return nucleos;
	}
	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	public int getCache() {
		return cache;
	}
	public void setCache(int cache) {
		this.cache = cache;
	}
	public String getSocket() {
		return socket;
	}
	public void setSocket(String socket) {
		this.socket = socket;
	}
	@Override
	public String toString() {
		return "Procesador [nucleos=" + nucleos + ", frecuencia=" + frecuencia + ", cache=" + cache + ", socket="
				+ socket + "]";
	}
	
	
}
