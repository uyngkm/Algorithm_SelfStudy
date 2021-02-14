public class SwapTest {
	public static void main(String[] args) {
		int[] arr = { 30, 40 };

		System.out.println(arr[0]);
		System.out.println(arr[1]);

		System.out.println("========================");

		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}
}
