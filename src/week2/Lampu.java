package week2;

public class Lampu {
	boolean nyala;
	
	boolean nyalakanLampu() {
		nyala = true;
		return nyala;
	}
	
	boolean matikanLampu() {
		nyala = false;
		return nyala;
	}
}
