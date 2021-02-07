import java.util.Arrays;

//nCr 
public class CombinationTest {
	static int[] numbers;
	static int N = 4, R = 2;

	public static void main(String[] args) {
		numbers = new int[R];
		combination(0,1);
	}

	static void combination(int cnt, int start) {
		
		if (cnt==R) {
			System.out.println(Arrays.toString(numbers));
			return;
		} 
		
		for (int i = start; i <= N; i++) { // start부터 뽑는다.
			numbers[cnt] = i;
			combination(cnt + 1, i + 1);
		}
	}
}
