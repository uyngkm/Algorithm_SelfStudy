import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9498_시험성적 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine().trim());

		switch (score / 10) {
		case 10:
			System.out.println("A");
			break;

		case 9:
			System.out.println("A");
			break;

		case 8:
			System.out.println("B");
			break;

		case 7:
			System.out.println("C");
			break;

		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("F");

		}
	}
}
