
// X로 표시된 항목의 상하좌우 숫자의 합을 구하는 코드를 작성하시오
/*
 2 3 1 4
 1 X 3 2 
 3 4 X X 
 X 4 1 5
 */

import java.util.Scanner;

public class 시뮬레이션3 {
	static char Matrix[][] = new char[4][4];
	static boolean isVisited[][] = new boolean[4][4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Matrix[i][j] = sc.next().charAt(0);
			}
		}

		int sum = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (Matrix[i][j] == 'X') {
					if (i - 1 >= 0 && Matrix[i - 1][j] != 'X' && isVisited[i - 1][j] == false) { //!isVisted[i-1][j] 가능
						sum = sum + Matrix[i - 1][j] - '0';
						isVisited[i - 1][j] = true; //사용했다 표시 
					}
					if (i + 1 <4 && Matrix[i + 1][j] != 'X' && isVisited[i + 1][j] == false) {
						sum = sum + Matrix[i + 1][j] - '0';
						isVisited[i + 1][j] = true; //사용했다 표시 
					}
					if (j - 1 >= 0 && Matrix[i][j-1] != 'X' && isVisited[i][j-1] == false) {
						sum = sum + Matrix[i][j-1] - '0';
						isVisited[i][j-1] = true; //사용했다 표시 
					}
					if (j + 1 < 4 && Matrix[i][j+1] != 'X' && isVisited[i][j+1] == false) {
						sum = sum + Matrix[i][j+1] - '0';
						isVisited[i][j+1] = true; //사용했다 표시 
					}
				}
			}
		}
		System.out.println(sum);
	}
}
