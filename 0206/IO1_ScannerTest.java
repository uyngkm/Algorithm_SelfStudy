
import java.util.Scanner;

public class IO1_ScannerTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수, 실수, 문자열을 차례대로 입력하시오.");

		System.out.println("읽은 정수: "  + sc.nextInt());
		System.out.println("읽은 실수: "  + sc.nextDouble());		
		//System.out.println("읽은 문자열: " + sc.nextLine());
		//System.out.println("읽은 문자열: " + sc.next());
	}
}


//System.out.println("읽은 정수: "  + sc.nextInt());
//System.out.println("읽은 실수: "  + sc.nextDouble());		
//System.out.println("읽은 문자열: " + sc.next());
//
//정수, 실수, 문자열을 차례대로 입력하시오.
//1  3.5			Hello SSAFY
//읽은 정수: 1
//읽은 실수: 3.5
//읽은 문자열: Hello


//System.out.println("읽은 정수: "  + sc.nextInt());
//System.out.println("읽은 실수: "  + sc.nextDouble());		
//System.out.println("읽은 문자열: " + sc.nextLine());
//정수, 실수, 문자열을 차례대로 입력하시오.
//1  3.5			Hello SSAFY
//읽은 정수: 1
//읽은 실수: 3.5
//읽은 문자열: 			Hello SSAFY
