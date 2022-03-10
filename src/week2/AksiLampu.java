package week2;

public class AksiLampu {
	public static void main(String[] args) {
		Lampu lampu = new Lampu();
		
		System.out.println("Apakah lampu menyala? " + lampu.nyalakanLampu());
		System.out.println("---------------------------");
		System.out.println("Apakah lampu menyala? " + lampu.matikanLampu());
	}
}
