
/*
 * 가능한 파이프를 여러개 동시에 설치
 * 
 * 1. 첫 파이프를 놓는 위치에 따라 다음 파이프 영향 받음
 * - 가능한 한 윗행부터 놓아야 최대한 많은 파이프를 놓을 수 있다.
 * 
 * 2. 시간 복잡도 (가지 치기) 
 * - 파이프 놓기에 성공했다면 처음으로 리턴 (왜? 최선의 결정)
 * - 이전 파이프 놓기에 실패한 흔적을 지우지 않는다. (백 트래킹!)
 * 
 * cf) 
 * 사방 탐색: 탐색 방향 순서 상관 없다. 
 * 탐색 해보고 경로 지우고 다시 돌아와서 탐색.
 * 
 * 경로 문제는 길이 다르면 다른 경로로 생각한다. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3109_빵집 {

	static int R, C, cnt = 0;
	static char[][] map;
	static boolean[][] visited;

// #1
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		map = new char[R][];
		visited = new boolean[R][C];

		for (int i = 0; i < R; i++) {
			map[i] = in.readLine().toCharArray();
		}
		makePipe();
		System.out.println(cnt);
	}

// #3
	private static void makePipe() {
		cnt = 0;
		for (int i = 0; i < R; i++) {
			visited[i][0] = true;
			dfs(i, 0);
		}
	}

// #2
	static int[] dr = { -1, 0, 1 };

	private static boolean dfs(int r, int c) { // 현재 탐색 위치를 받아야한다.
		int nr, nc = c + 1;
		
		if (c==C-1) {
			cnt ++;
			return true; // 파이프 놓기 성공
		}
		
		// 탐색 위치에서 3방향에 대한 탐색한다.
		for (int d = 0; d < 3; d++) { 
			nr = r + dr[d];
			// 열은 경계 체크 하지 않는다 (기저 조건에서)
			// 유망하지 않으면 안 간다. 아까 가봤던 애들이 있어
			if (nr < 0 || nr >= R || map[nr][nc] == 'x' || visited[nr][nc])
				continue; // 가지 않는다. 
			
			visited[nr][nc] = true;
			// 끝 까지 가봤는데 ㄱㅊ았어. 그럼 나 더 이상 할 필요없네: return true
			// 끝 까지 가봤는데 ㄱㅊ지 않았어 -> d 증가 for 문 다시 돈다.
			if (dfs(nr,nc)) return true; 
			
			// 실페했던 흔적 되돌리지 않기: 뒤의 선택지 방향은 현재보다 유리하지 않다. (가지 치기 효괴)
			// visited[nr][nc] = true; 
		}
		
		// 세 방향 시도했는데 재귀 타고 들어가지 못했다면 
		return false;
		
	}

} // class
