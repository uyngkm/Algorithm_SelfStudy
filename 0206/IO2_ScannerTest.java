import java.util.Scanner;

public class IO2_ScannerTest {
	public static void main(String[] args) {

		String s1 = "안 \n녕\n";
		Scanner sc = new Scanner(s1);
		System.out.print("읽은 문자열:" + sc.next());
		System.out.print(",읽은 문자열:" + sc.next());
		System.out.print("\n===============================");
		
		String s2 = "안 녕\n";
		Scanner sc2 = new Scanner(s2);
		System.out.print("읽은 문자열:" + sc2.nextLine());
		System.out.print("\n===============================");
		
		String s3 ="안    \n			녕\n";
		Scanner sc3 = new Scanner(s3);
		System.out.print("읽은 문자열:" + sc3.nextLine());
		System.out.print(",읽은 문자열:" + sc3.next());
	}
}

//읽은 문자열:안,읽은 문자열:녕
//===============================읽은 문자열:안 녕
//===============================읽은 문자열:안    ,읽은 문자열:녕

//next(), nextDouble(), nextInt()
//==>구분자 만나면 그 직전까지 읽어들인다. 구분자 남아있어.
//nextLine()
//==>구분자까지 읽어들인다. 우리한테 줄 때는 구분자 버리고 내용만 준다.

