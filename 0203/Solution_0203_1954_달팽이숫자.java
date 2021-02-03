import java.util.Arrays;
import java.util.Scanner;

public class Solution_0203_1954_달팽이숫자 {

	static int T;
	static int N;
	static int[][] snail;
	static int[] dy = { 0, 1, 0, -1 };
	static int[] dx = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			N = sc.nextInt();
			snail = new int[N][N];

			// (0,0)에서 출발
			int num = 1;

			int y = 0;
			int x = 0;
			int d = 0;

			// 돌아다니면서 값 채움
			for (int p = 0; p < N; p++) {
				for (int q = 0; q < N; q++) {

					snail[y][x] = num;
					num++;

					// 방향 변경
					if (d == 0) {// 우
						if (x + dx[d] >= N || snail[y][x + dx[d]] != 0)
							d = 1;
					} else if (d == 1) {// 하
						if (y + dy[d] >= N || snail[y + dy[d]][x] != 0)
							d = 2;
					} else if (d == 2) {// 좌
						if (x + dx[d] < 0 || snail[y][x + dx[d]] != 0)
							d = 3;
					} else if (d == 3) {// 상
						if (y + dy[d] < 0 || snail[y + dy[d]][x] != 0)
							d = 0;
					}

					// 인덱스 정하고
					y = y + dy[d];
					x = x + dx[d];

				}
			}
			//출력
			print(i, snail);
		} // T
		sc.close();
	} // main

	static void print(int i, int[][] snail) {
		System.out.println("#" + i);
		for (int m = 0; m < N; m++) {
			for (int n = 0; n < N; n++) {
				System.out.print(snail[m][n] + " ");
			}
			System.out.println(" ");
		}
	}
}// class
