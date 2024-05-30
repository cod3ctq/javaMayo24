package comm;

public class Principal {
	
	public static void main(String[] args) {
		
		Laptops lap= new Laptops(null, null, 0, null, null, null, false);
		
		
		Almacenamiento alma = new Almacenamiento("Samsung", "dim", 256);
		Procesador proce=new Procesador(4, 2300, 124, "lga");
		Ram ram1 = new Ram("Kingstone", "ddr4", 8, 2300);
		
		Smartphone cel1 = new Smartphone("OnePlus", "10 pro", 10000, alma, proce, ram1, false, "telcel");
		
		
		System.out.println(cel1);
	}
}
