import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\n");

		int[][] arr2 = { { 11 }, { 21, 31 }, { 41, 51, 61 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("\n");
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		System.out.println("===================================");
		
		int [][]arr3 = new int [3][3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		
		System.out.println("\n");

		for (int i = 0; i < arr3.length; i++) {
			Arrays.fill(arr3[i], 1);
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		
	}//main
}//class
