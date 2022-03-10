package week2;

public class AksiSepeda {
	public static void main(String[] args) {
		Sepeda sepedaBalap = new Sepeda(2, "lipat", "poligon");
		
		int gearSepeda = sepedaBalap.gear;
		System.out.println(gearSepeda);
		sepedaBalap.ngerem();
		
		System.out.println("----------------------------------------------------");
		
		Sepeda sepedaGunung = new Sepeda(2, "gunung", "polygon");
		
		int gearSepedaGunung = sepedaGunung.gear;
		System.out.println(gearSepedaGunung);
		
		System.out.println("Jumlah gear" + gearSepeda);
		sepedaGunung.ngerem();
	}
}
