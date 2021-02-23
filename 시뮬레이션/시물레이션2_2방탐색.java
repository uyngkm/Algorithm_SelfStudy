
//X로 표시된 항목의 좌우 숫자의 합을 구하는 코드
/*
 2 3 1 4
 1 X 3 2 
 3 4 X X
 X 4 1 5
 */

import java.util.Scanner;

public class 시물레이션2 {

	static char[][] Matrix = new char[4][4];
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Matrix[i][j] = sc.next().charAt(0);
			}
		}

		// 합 구하기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (Matrix[i][j] == 'X') {
					if ( j-1>=0 && Matrix[i][j-1] != 'X') {
						sum += Matrix[i][j-1] = '0';
					}
					if ( j+1<N && Matrix[i][j+1] != 'X') {
						sum += Matrix[i][j+1] = '0';
					}
				}
			}
		}

		System.out.println(sum);

	}
}
