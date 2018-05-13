
public class latihan3 {
	public static void tambahNilai(int nilai) {
		int [] tambah = {
				1,3,5,5,6,7,8
		};
		for (int i = 0; i < tambah.length; i++) {
			tambah[i] += nilai;
			System.out.print(tambah[i]);
		}
		
	}
	public static void main (String[] args) {
		tambahNilai(3);
		tambahNilai(4);
		tambahNilai(5);
	}
}
