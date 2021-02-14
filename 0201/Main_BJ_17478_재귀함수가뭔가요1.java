import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BJ_17478_재귀함수가뭔가요1 {

	static String[] sArr;
	static String underBar = "";

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		sArr = new String[6];
		sArr[0] = "\"재귀함수가 뭔가요?\"";
		sArr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		sArr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		sArr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		sArr[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		sArr[5] = "라고 답변하였지.";

		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursive(N);

		br.close();
	} // main

	static void recursive(int N) {
		String temp = underBar;
		
		// 기저 조건
		if (N == 0) {
			System.out.println(temp + sArr[0]);
			System.out.println(temp + sArr[4]);
			System.out.println(temp + sArr[5]);
			return;
		}

		// 유도 파트
		for (int i = 0; i <= 3; i++) {
			System.out.println(temp + sArr[i]);
		}

		underBar += "____";
		recursive(--N);

		System.out.println(temp + sArr[5]);

	} // recursive

} // class
