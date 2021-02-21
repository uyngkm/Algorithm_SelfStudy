import java.util.Arrays;
import java.util.Scanner;

public class PermutationBasicTest {
	static int N;
	static int[] input, numbers;
	static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		input = new int[N];
		numbers = new int[N];
		isSelected = new boolean[N];

		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		
		permutation(0);

	} // main

	private static void permutation(int cnt) {
		
		if (cnt==N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// 한 자리에 대해 모든 수를 시도해본다.
		for (int i = 0; i < N; i++) {
			// 사용 중이라면 다음 수를 시도한다.
			if (isSelected[i]) continue;
			
			// 사용 중이지 않다면 그 수를 넣는다.
			numbers[cnt]=input[i];
			isSelected[i] = true; //그 수를 사용 중이다 라고 표시한다.
			
			// 다음 자리 수를 뽑는다. 
			permutation(cnt+1); 
			
			// 그 자리에 다른 수를 시도하기 위해 쓰지 않았다고 표시한다.
			isSelected[i] = false;
		}
	}

}
