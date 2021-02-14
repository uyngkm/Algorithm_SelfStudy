import java.util.Scanner;

public class Solution_1289_원재의메모리복구하기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String input = sc.next();
			System.out.printf("#%d %d", tc, count(input));
			System.out.println();
		}
		sc.close();
	}// main

	static int count(String input) {
		char[] bits = input.toCharArray();
		int index = 0;
		int cnt = 0;
		char current = '0';

		while (index < bits.length) {
			if (current != bits[index]) {
				current = bits[index];
				cnt++;
			}
			index++;
		}
		return cnt;
	}// count method
}// class