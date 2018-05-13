
public class PrintArray {
	/**
	 * Method untuk menampilkan output array 1 dimensi
	 * @param array bertipe data integer
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	/**
	 * 
	 * @param array
	 */
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int [] array1D = {1, 2, 3};
		int[][] array2D = {
				{1, 2, 3},
				{4, 5},
				{6},
				{7, 8, 9, 10, 11, 12}
		};
		
		System.out.println("Array 1 Dimensi: ");
		printArray(array1D);
		System.out.println();
		
		System.out.println("Array 2 Dimensi: ");
		printArray(array2D);

	}

}
