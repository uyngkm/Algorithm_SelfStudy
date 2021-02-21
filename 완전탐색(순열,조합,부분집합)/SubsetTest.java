import java.util.Arrays;
import java.util.Scanner;

public class SubsetTest {

	static int N, totalCnt;

	static int[] input;
	static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		input = new int[N];
		isSelected = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		
		generateSubset(0);
		System.out.println("총 경우의 수: "+ totalCnt);
	}

	private static void generateSubset(int cnt) {

		if (cnt == N) {
			++totalCnt;

			for (int i = 0; i < N; i++) {
				// 인덱스에 해당되는 원소가 부분집합에 포함되었다면 그에 해당하는 원소 출력
				System.out.print(isSelected[i]? input[i] + "\t": "X" + "\t");
			}
			System.out.println();
			return;
		}

		// 해당 인덱스 선택
		isSelected[cnt] = true;
		generateSubset(cnt + 1); // 다 하고온다.

		// 해당 인덱스 비선택
		isSelected[cnt] = false;
		generateSubset(cnt + 1); // 다 하고온다.
	}

}
