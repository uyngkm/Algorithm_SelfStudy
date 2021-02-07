public class R2_ArrayTest {

	// 1차원 배열
	static int[] arr = { 10, 20, 30 };

	private static void printArray1(int i) {
		if (i == arr.length) {
			System.out.println("");
			return;
			
		}

		System.out.print(arr[i] + "\t");
		printArray1(i + 1);
	}

	// 2차원 배열
	static int[][] arr2 = { { 11, 12, 13 }, { 20, 30, 40 } };
	
	private static void printRowArray(int i) {
		
		if (i==arr2.length) return;
			
		for (int j = 0; j < arr2[i].length; j++) {
			System.out.print(arr2[i][j]+"\t");
		}
		System.out.println();
		
		printRowArray(i+1);
	}
	

	public static void main(String[] args) {
		printArray1(0);
		printRowArray(0);
	}
}
