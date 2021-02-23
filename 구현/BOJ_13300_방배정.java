import java.util.Arrays;
import java.util.Scanner;

public class BOJ_13300_방배정 {
	static int N;
	static int K;

	static int S;
	static int Y;

	static int room;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 수학여행에 참가하는 학생 수
		K = sc.nextInt(); // 한 방에 배정할 수 있는 최대 인원 수

		int[][] array = new int[2][7];

		for (int tc = 1; tc <= N; tc++) {
			S = sc.nextInt(); // 성별
			Y = sc.nextInt(); // 학년

			for (int i = 0; i < 2; i++) {
				for (int j = 1; j <= 6; j++) {
					if (i == S && j == Y) {
						array[i][j]++;
					}
				}
			}
		} // tc
		


		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= 6; j++) {
				
				if (array[i][j] <= K && array[i][j] > 0) {
					room++;
				}

				if (array[i][j] > K) {
					if (array[i][j] % K == 0) {
						room = room + (array[i][j] / K);
					} else {
						room = room + (array[i][j] / K) + 1;
					}

				}
			}
		}

		System.out.println(room);

	}
}
