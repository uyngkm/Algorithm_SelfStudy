import java.util.Arrays;

public class CombinationTest {

	static int[] numbers;
	static int N = 4, R = 2;

	public static void main(String[] args) {
		numbers = new int[R];
		combination(0, 1); //1: 자연수 1부터 뽑는다. 
	}

	static void combination(int cnt, int start) {
		if (cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = start; i <= N; i++) {
			numbers[cnt] = i;

			combination(cnt + 1, i + 1); // start는 뽑기 시작한 지점, i+1: 다음 자리는 현재 뽑은 수 다음 수 부터 뽑아라
		}
	}
}
