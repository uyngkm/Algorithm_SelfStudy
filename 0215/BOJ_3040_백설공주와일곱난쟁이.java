import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_3040_백설공주와일곱난쟁이 {
	static int[] given_array = new int[10]; // 입력 받은 9개 수의 배열 (dummy 만들어 주었다.)
	static int[] result_array = new int[8]; // 9개 중에 7개를 선택한 배열 (dummy 만들어 주었다.)

	public static void main(String[] args) throws Exception {

		// 입력 part
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= 9; i++) {// 9개의 수를 입력 받아 배열에 넣는다.
			given_array[i] = Integer.parseInt(br.readLine());
		}

		// 메커니즘 part
		real_dwarf_combination(1, 1); // cnt = 1, start = 1 부터 시작한다.

	} // main

	private static void real_dwarf_combination(int cnt, int start) {
		// 기저 파트
		if (cnt == 8) { //result_array 배열에서 원소 7개를 다 채운다면 
			int sum = 0;
			for (int i = 1; i <= 7; i++) {
				sum += result_array[i];
			}
			if (sum == 100) { 
				for (int i = 1; i <= 7; i++) {
					System.out.println(result_array[i]);
				}
			}
			return;
		}
		
		// 유도 파트
		for (int i = start; i <= 9; i++) { 
			result_array[cnt] = given_array[i]; // result_array의 cnt자리에 given_array의 start부터 해당하는 값 넣어준다. 
			real_dwarf_combination(cnt + 1, i + 1); // result_array의 cnt+1 자리에 start보다 큰 애들  넣어준다. 
		}
	}
} // class
