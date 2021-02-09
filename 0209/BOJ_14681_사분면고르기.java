import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14681_사분면고르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		if (num1 > 0 && num2 >0) {
			System.out.println("1");
		}else if (num1 < 0 && num2 >0) {
			System.out.println("2");
		}else if (num1 < 0 && num2 <0) {
			System.out.println("3");
		}else
			System.out.println("4");
	}
}
