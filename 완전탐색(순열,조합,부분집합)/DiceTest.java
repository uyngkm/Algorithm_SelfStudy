import java.util.Arrays;
import java.util.Scanner;

public class DiceTest {
	static int[] numbers;
	static int N, totalCnt;
	static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		numbers = new int[N];
		isSelected = new boolean[7];

		int M = sc.nextInt(); // 모드

		switch (M) {
		case 1:
			Rep_Permutation(0);
			break;
		case 2:
			Permutation(0);
			break;
		case 3:
			Rep_Combination(0, 1);
			break;
		case 4:
			Combination(0, 1);
			break;
		}

		System.out.println("총 경우의수: " + totalCnt);

	}

	// 중복순열
	public static void Rep_Permutation(int cnt) {

		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 1; i <= 6; i++) {
			numbers[cnt] = i;

			Rep_Permutation(cnt + 1);
		}
	}

	// 순열
	public static void Permutation(int cnt) {
		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 1; i <= 6; i++) {
			if (isSelected[i])
				continue;

			numbers[cnt] = i;
			isSelected[i] = true;

			Permutation(cnt + 1);
			isSelected[i] = false;

		}
	}

	// 중복조합
	public static void Rep_Combination(int cnt, int start) {
		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = start; i <= 6; i++) {
			numbers[cnt] = i;
			Rep_Combination(cnt + 1, i);

		}
	}

	// 조합
	public static void Combination(int cnt, int start) {
		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = start; i <= 6; i++) {
			numbers[cnt] = i;
			Combination(cnt + 1, i + 1);
		}
	}

}
