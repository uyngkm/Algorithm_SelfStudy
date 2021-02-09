import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563_색종이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] coordination = new int[100][100];

		int N = Integer.parseInt(br.readLine());
		int count = 0;

		for (int tc = 1; tc <= N; tc++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int side_distance = Integer.parseInt(st.nextToken());
			int floor_distance = Integer.parseInt(st.nextToken());

			for (int m = side_distance; m < side_distance + 10; m++) {
				for (int n = floor_distance; n < floor_distance + 10; n++) {
					if (coordination[m][n] == 0) {
						coordination[m][n] = 1;
						count+=1;
					}
				}
			}
		} // tc
		System.out.println(count);
	} // main
} // class
