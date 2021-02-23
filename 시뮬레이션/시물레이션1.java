/*
 Matrix 입력하기
 */

import java.util.Scanner;

public class 시물레이션1 {

	static char[][] Matrix = new char [4][4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Matrix[i][j] = sc.next().charAt(0);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(Matrix[i][j]);
			}
			System.out.println();
		}		
	}
}
