import java.util.Arrays;

public class ArrayShfit {

	static int [] arr = { 1, 2, 3, 4 };
	static int [] store = new int[4];

	private static void shift() {
		int temp = arr[arr.length - 1];
		for (int i = 0; i <= arr.length - 2; i++) {
			store[i + 1] = arr[i];
		}
		store[0] = temp;
	}

	private static void print() {

		System.out.println(Arrays.toString(store));
	}
	
	public static void main(String[] args) {
		shift();
		print();
	}
}
