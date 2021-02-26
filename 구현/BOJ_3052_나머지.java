import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3052_나머지 {

	static boolean[] int_array = new boolean[42];

	static int diff_number;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			int_array[sc.nextInt() % 42] = true;
		}
		
		for (int i = 0; i < 42; i++) {
			if (int_array[i] == true) {
				diff_number++;
			}
		}
		
		System.out.println(diff_number);

	}
}
