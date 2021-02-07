import java.util.Scanner;

public class IO3_ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("기수: " + sc.nextInt());
		//System.out.println("이름: " + sc.next());
		sc.nextLine();//버림
		System.out.println("이름: " + sc.nextLine());
	}
}

//5
//기수: 5
//이름: 
//5 이후부터 엔터까지 입력 받고 엔터 떼고 준다. 

//next: 구분자 앞까지 읽고 구분자 남겨둔다.
//nextLine: 구분자(개행)까지 읽고 싹 버린다. 
