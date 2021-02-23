import java.util.Scanner;

public class BOJ_8320_직사각형을만드는방법 {
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // N을 입력

		int number = 0; // 만들 수 있는 총 모양의 개수

		number++; // 1은 해결
		for (int i = 2; i <= N; i++) { // 자연수 2 부터 N까지에 대해
			int repeat = 0; // 각 수의 약수의 개수
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					repeat++;
				}
			}
			if (repeat % 2 == 0) { // 약수의 개수가 짝수라면 2로 나눈 것이 총 모양의 개수
				number += repeat / 2;
			}
			if (repeat % 2 != 0) {// 약수의 개수가 홀수라면 2로 나눈 것 +1 이 총 모양의 개수
				number += repeat / 2 + 1;
			}
		}

		System.out.println(number);

	}
}
