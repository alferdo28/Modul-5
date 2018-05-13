
public class latihan2 {
	public static void tampilBahasa(String bahasa) {
		if (bahasa.equalsIgnoreCase("In")) {
			System.out.println("Selamat Pagi");
		} else if (bahasa.equalsIgnoreCase("En")) {
			System.out.println("Good Morning");
		} else if (bahasa.equalsIgnoreCase("Jv")) {
			System.out.println("Sugeng Enjing");
		} else if (bahasa.equalsIgnoreCase("De")) {
			System.out.println("Guten Morgen");
		} 
	}
	public static void main (String[] args) {
		tampilBahasa("In");
		tampilBahasa("En");
		tampilBahasa("jv");
		tampilBahasa("de");
	}
}
