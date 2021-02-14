import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_16935 {
	static int N;
	static int M;
	static int R;
	static int[][] Matrix;

	public static void main(String[] args) throws Exception {

		// 삽입 부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 배열의 크기
		M = Integer.parseInt(st.nextToken()); // 배열의 크기
		R = Integer.parseInt(st.nextToken()); // 수행해야하는 연산 수

		Matrix = new int[N][M];

		for (int i = 0; i < N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				Matrix[i][j] = Integer.parseInt(st1.nextToken());
			}
		}

		// 수행할 연산 remote control
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int number = 1; number <= R; number++) {
			switch (Integer.parseInt(st2.nextToken())) {
			case 1:
				operation1();
				break;
			case 2:
				operation2();
				break;
			case 3:
				operation3();
				break;
			case 4:
				operation4();
				break;
			case 5:
				operation5();
				break;
			case 6:
				operation6();
				break;
			}
		}
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < M; col++) {
				System.out.print(Matrix[row][col] + " ");
			}
			System.out.println();
		}
		br.close();
	} // main

	// 수행할 연산 목록
	private static void operation1() {
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M; j++) {
				int temp = Matrix[(N - 1) - i][j];
				Matrix[(N - 1) - i][j] = Matrix[i][j];
				Matrix[i][j] = temp;
			}
		}
	}

	private static void operation2() {
		for (int j = 0; j < M / 2; j++) {
			for (int i = 0; i < N; i++) {
				int temp = Matrix[i][(M - 1) - j];
				Matrix[i][(M - 1) - j] = Matrix[i][j];
				Matrix[i][j] = temp;
			}
		}
	}

	private static void operation3() {
		int[][] Converted_Matrix = new int[M][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				Converted_Matrix[j][N - 1 - i] = Matrix[i][j];
			}
		}

		Matrix = Converted_Matrix;

		int temp = N;
		N = M;
		M = temp;
	}

	private static void operation4() {
		int[][] Converted_Matrix = new int[M][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				Converted_Matrix[M - 1 - j][i] = Matrix[i][j];
			}
		}
		int temp = N;
		N = M;
		M = temp;

		Matrix = Converted_Matrix;

	}

	private static void operation5() {
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M / 2; j++) {
				int temp = Matrix[i][j];
				Matrix[i][j] = Matrix[i][j + M / 2];
				Matrix[i][j + M / 2] = temp;
			}
		}

		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M / 2; j++) {
				int temp = Matrix[i][j];
				Matrix[i][j] = Matrix[i + N / 2][j + M / 2];
				Matrix[i + N / 2][j + M / 2] = temp;
			}
		}

		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M / 2; j++) {
				int temp = Matrix[i][j];
				Matrix[i][j] = Matrix[i + N / 2][j];
				Matrix[i + N / 2][j] = temp;
			}
		}

	}

	private static void operation6() {
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M / 2; j++) {
				int temp = Matrix[i][j];
				Matrix[i][j] = Matrix[i + N / 2][j + M / 2];
				Matrix[i + N / 2][j + M / 2] = temp;
			}
		}

		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M / 2; j++) {
				int temp = Matrix[i][j];
				Matrix[i][j] = Matrix[i][j + M / 2];
				Matrix[i][j + M / 2] = temp;
			}
		}

		for (int i = N / 2; i < N; i++) {
			for (int j = 0; j < M / 2; j++) {
				int temp = Matrix[i][j];
				Matrix[i][j] = Matrix[i][j + M / 2];
				Matrix[i][j + M / 2] = temp;
			}
		}
	}

}
