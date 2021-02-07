import java.util.Arrays;

public class A2_TransposeMatrixTest {
	private static int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	private static void transpose() {
		final int N = arr.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i < j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
	}

	private static void print() {
		for (int[] subArr : arr) {
			System.out.println(Arrays.toString(subArr));
		}
	}

	public static void main(String[] args) {
		print();
		transpose();
		System.out.println("==========");
		print();
	}

}
