import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14696_딱지놀이 {
	static int N;
	
	static char winner;

	public static void main(String[] args) throws Exception, IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		for (int tc = 1; tc <= N; tc++) {
			int[] numbers_A = new int[5];
			int[] numbers_B = new int[5];
			// 숫자 입력
			numbers_A[0] = sc.nextInt();
			for (int i = 1; i <= numbers_A[0]; i++) {
				numbers_A[sc.nextInt()]++;
			}

			numbers_B[0] = sc.nextInt();
			for (int i = 1; i <= numbers_B[0]; i++) {
				numbers_B[sc.nextInt()]++;
			}

//			System.out.println(Arrays.toString(numbers_A));
//			System.out.println(Arrays.toString(numbers_B));

			// 승부 판단

			for (int i = 4; i >= 1; i--) {
				winner = 'D';
				
				if (numbers_A[i] > numbers_B[i]) {
					winner = 'A';
					break;

				} else if (numbers_A[i] < numbers_B[i]) {
					winner = 'B';
					break;
				}
			}
			System.out.println(winner);

		} // tc

	}

}
