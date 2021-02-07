import java.util.Scanner;

public class R1_FactorialTest {
	
	// 반복문 
	private static int factorial(int n) {

		int result = 1;
		for(int i=n; i>0; --i) {
			result *= i;
		}
		return result;
	} 
	
	//반복문을 재귀로 고친 형태
	static int res=1;
	private static void factorial2(int n) {
		if(n==0) return;
		res *= n;
		factorial2(n-1);
	}
	
	// 리턴값을 활용한 재귀로 고친 형태
	private static int factorial3(int n) {
		if (n==1) return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(factorial(N));
		factorial2(N);
		System.out.println(res);
		System.out.println(factorial3(N));
	}

}
