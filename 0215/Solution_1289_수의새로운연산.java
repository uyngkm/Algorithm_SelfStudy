import java.util.Arrays;
import java.util.Scanner;

public class Solution_1289_수의새로운연산 {
	static int p;
	static int q;
	static int result;
	static int[][] Matrix;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int p = sc.nextInt();
			int q = sc.nextInt();

			operation(p, q);

			System.out.println("#" + tc + " " + result);
		}

	} // main

	private static int operation(int p, int q) {
		Matrix = new int[350][350];
		int k = 1;
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int diff = 1;
		int sub = 1;
		
		
		// 각 행의 1열 지정
		for (int i = 2; i < 350; i++) {
			Matrix[1][1] = 1;
			Matrix[i][1] = Matrix[i - 1][1] + sub;
			sub++;
		}
		
		// 각 행의 요소들 기입
		for (int i = 1; i < 350; i++) {
			diff = i + 1;
			for (int j = 1; j < 349; j++) {
				Matrix[i][j + 1] = Matrix[i][j] + diff;
				diff++;
			}
		}

		for (int i = 1; i < 350; i++) {
			for (int j = 1; j < 350; j++) {
				if (Matrix[i][j] == p) {
					i1 = i;
					i2 = j;
				}
			}
		}

		for (int i = 1; i < 350; i++) {
			for (int j = 1; j < 350; j++) {
				if (Matrix[i][j] == q) {
					i3 = i;
					i4 = j;
				}
			}
		}
		for (int i = 1; i < 350; i++) {
			for (int j = 1; j < 350; j++) {
				if (i == i1 + i3 && j == i2 + i4) {
					result = Matrix[i][j];
				}
			}
		}

		return result;
	} // operation

} // class
