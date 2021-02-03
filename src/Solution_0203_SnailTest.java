import java.util.Arrays;

//5X5 달팽이 행렬 만들기
public class Solution_0203_SnailTest {
	static int N = 5;
	static int[][] snail = new int[N][N];

	public static void main(String[] args) {
		System.out.println("달팽이 배열의 초기 상태");
		print();

		int num = 1;

		int[] dy = { 0, 1, 0, -1 };
		int[] dx = { 1, 0, -1, 0 };
		// 우 하 좌 상
		int d = 0;

		int y = 0;
		int x = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				snail[y][x] = num; // 슷지 넣어주기
				num++; // 슷지 1 증가
				print();
				System.out.println(" ");

				// d 설정
				if (d == 0) {
					if (x + dx[d] >= N || snail[y][x + dx[d]] != 0)
						d = 1;
				} else if (d == 1) {
					if (y + dy[d] >= N || snail[y + dy[d]][x] != 0)
						d = 2;
				} else if (d == 2) {
					if (x + dx[d] < 0 || snail[y][x + dx[d]] != 0)
						d = 3;
				} else if (d == 3) {
					if (y + dy[d] < 0 || snail[y+ dy[d]][x] != 0)
						d = 0;
				}

				// 인덱스 조정
				y = y + dy[d];
				x = x + dx[d];

			}
		}

	}

	static void print() {
		for (int i = 0; i < snail.length; i++) {
			System.out.println(Arrays.toString(snail[i]));
		}
	}
}
