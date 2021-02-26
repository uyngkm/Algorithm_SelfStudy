import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_8958_OX퀴즈_BufferedReader {
	static int N;
	static String[] str;

	static int score;
	static int sum;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		str = new String[N];

		for (int tc = 0; tc < N; tc++) {
			str[tc] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			sum = 0;
			score = 0;
			
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') {
					score++;
				} else if (str[i].charAt(j) == 'X') {
					score = 0;
				}
				sum += score;
			}
			
			System.out.println(sum);
		}
	}
}
