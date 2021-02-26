import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2798_블랙잭 {

	static int N;
	static int M;

	static int[] input = new int[N];
	static int[] res = new int[3];
	
	static int sum;
	static int answer;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 주어지는 카드 개수
		M = sc.nextInt(); // 기준값

		input = new int[N];

		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		
		Combination(0, 0);
		
		System.out.println(answer);
	}

	private static void Combination(int cnt, int start) {

		if (cnt == 3) {
			sum = 0;
			for (int i = 0; i < 3; i++) {
				sum+=res[i];
			}
			if (sum <= M && sum>answer)
				answer = sum;
			return;
		}

		for (int i = start; i < N; i++) {
			res[cnt] = input[i];
			Combination(cnt + 1, i + 1);
		}

	}
}
