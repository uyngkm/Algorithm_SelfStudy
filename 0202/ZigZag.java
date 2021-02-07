public class ZigZag {

	static int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	static int ROW;
	static int COL;

	public static void main(String[] args) {
		ROW = arr.length;
		COL = arr[0].length;

		System.out.println("지그재그 탐색");
		searchByZigzag();
	}

	private static void searchByZigzag() {
		for (int i = 0; i < ROW; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < COL; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			if (i % 2 == 1) {
				for (int j = COL - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		}
	}
}