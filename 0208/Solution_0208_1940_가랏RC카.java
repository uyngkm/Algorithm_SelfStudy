import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_0208_1940_가랏RC카{
	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			int distance = 0;
			int M = 0;
			int a = 0;
			int v = 0;
			for (int i = 1; i <= N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				M = Integer.parseInt(st.nextToken());
				if (M == 1 || M == 2) {
					a = Integer.parseInt(st.nextToken());
				}

				switch (M) {
				case 0:
					v = v;
					break;
				case 1:
					v= v+a;
					break;
				case 2:
					v = v-a;
					if (v<0) v=0;
					break;
	
				}
				distance += v;
			}
		
		System.out.println("#"+tc+" "+distance);
		}
	}
}
