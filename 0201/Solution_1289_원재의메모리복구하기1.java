import java.util.Scanner;

public class Solution_1289_원재의메모리복구하기1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] ans = new int [T];

		for (int tc = 1; tc <= T; tc++) {
			String data = sc.next();
			int N = 0;
			
			if (data.startsWith("1")) N++;
			for (int i = 0; i < data.length()-1; i++) {
				if(data.charAt(i+1) != data.charAt(i))
					N++;
			}
			ans[tc-1] = N;
		}
		for (int i = 0; i < T; i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}

	} // main
} // class

/*
 startsWith(): 지정한 문자로 시작 | endsWith(): 지정한 문자로 끝
 public class Test{
 	String s1 = "This is SSAFY Zone!";
	System.out.println(s1.startsWith("this");	// false	
	System.out.println(s1.startsWith("This");	// true		 
	
 	String s2 = "This is SSAFY Zone!";
	System.out.println(s2.endsWith("Zone");		// false	
	System.out.println(s2.endsWith("Zone!");	// true	
	
 }
 
 */

