
public class RotasiMatiks {
	
	/**
	 * Method untuk menampilkan output suatu matriks
	 * @param array (berbagai bentuk matriks)
	 */
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * Method untuk memutar elemen matriks sebanyak 90 derajat sesuai arah jarum jam
	 * @param matriks (berbagai bentuk matriks)
	 * @return nilai dari matriksHasil yang diperoleh dari matriksAsal
	 */
	public static int[][] rotate(int[][] matriks) {
		int baris = matriks[0].length;
		int kolom = matriks.length;
		int[][] matriksHasil = new int[baris][kolom];
		
		int k = 0;
		for (int i = 0; i < baris; i++) {
			int b = kolom - 1;
			for (int j = 0; j < kolom; j++) {
				matriksHasil[i][j] = matriks[b][k];
				b--;
			}
			k++;
		}
		return matriksHasil;
	}

	public static void main(String[] args) {
		int [][] matriksAsal = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int[][] hasilRotasi = rotate(matriksAsal);
		printArray(hasilRotasi);
	}

}
