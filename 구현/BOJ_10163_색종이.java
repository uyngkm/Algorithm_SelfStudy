import java.util.Scanner;

public class BOJ_10163_색종이 {
	static int N;
	static int[][] Matrix;

	public static void main(String[] args) throws Exception {

		// 입력
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		Matrix = new int[101][101];

		int start_x = 0;
		int start_y = 0;
		int d_x = 0;
		int d_y = 0;

		// 메커니즘
		for (int tc = 1; tc <= N; tc++) {
			start_x = sc.nextInt();
			start_y = sc.nextInt();
			d_x = sc.nextInt();
			d_y = sc.nextInt();

			for (int i = start_x; i < start_x + d_x; i++) {
				for (int j = start_y; j < start_y + d_y; j++) {
					Matrix[i][j] = tc; // 가장 위에 놓여 보이는 면으로 계산
				}
			}

		} // tc

		for (int tc = 1; tc <= N; tc++) {
			int cnt = 0;
			for (int i = 0; i <= 100; i++) {
				for (int j = 0; j <= 100; j++) {

					if (Matrix[i][j] == tc) {
						cnt++;
					}

				}
			}
			System.out.println(cnt);
		}

	}
}
