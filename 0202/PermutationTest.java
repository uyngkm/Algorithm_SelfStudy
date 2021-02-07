import java.util.Arrays;

//nPn
public class PermutationTest {
	static int[] numbers; // 뽑은 수를 기억
	static int N = 3;
	static boolean[] isSelected; // 사용되었는지 판단

	private static void permutation(int cnt) {// cnt: 직전까지 뽑은 원소의 개수

		if (cnt == N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 1; i <= N; i++) { // i : 시도하는 숫자
			if (isSelected[i])
				continue;

			numbers[cnt] = i;
			isSelected[i] = true;

			permutation(cnt + 1);
			isSelected[i] = false;
		}
	}

	public static void main(String[] args) {
		numbers = new int[N];
		isSelected = new boolean[N + 1]; // 0자리는 dummy

		permutation(0);
	}

}
