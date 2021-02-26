import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_8958_OX퀴즈_Scanner {
	static int N;
	static String str;

	static int score;
	static int sum;

	static char[] CharArray;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (int tc = 1; tc <= N; tc++) {
			sum = 0;
			str = sc.next(); // 한 줄 입력

			CharArray = new char[str.length()];

			for (int i = 0; i < str.length(); i++) {
				CharArray[i] = str.charAt(i);
			}
			
			score = 0;
			for (int i = 0; i < str.length(); i++) {
				if (CharArray[i] == 'O') {
					score++;
					
				} else if (CharArray[i] == 'X') {
					score = 0;
				}

				sum += score;
			}
			System.out.println(sum);
		}
		
	}
}
