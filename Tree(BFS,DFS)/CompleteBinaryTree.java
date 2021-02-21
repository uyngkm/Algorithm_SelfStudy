import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {

	private char[] nodes; // 노드
	private int lastIndex; // 마지막으로 추가된 노드의 인덱스
	private final int SIZE;

	// 생성자
	public CompleteBinaryTree(int size) {
		super();
		SIZE = size;
		nodes = new char[size + 1]; // 1 인덱스 부터 사용 (1차원 배열로 완전 이진트리 만들기)
	}

	// 비어있는 지 확인
	public boolean isEmpty() {
		return lastIndex == 0; // lastIndex가 0이면 비어있다고 한다.
	}

	// 가득 차있는 지 확인
	public boolean isFull() {
		return lastIndex == SIZE; // lastIndex가 SIZE와 같다면 가득 차있다고 한다.
	}

	// 문자를 추가
	public void add(char e) {
		if (isFull()) {
			System.out.println("포화상태입니다.");
			return;
		}
		nodes[++lastIndex] = e; // 마지막 원소보다 하나 더 증가한 위치에 추가
	}

	// BFS 탐색
	public void bfs1() {
		// 트리가 비어있다면 탐색하지 않는다.
		if (isEmpty())
			return;

		// 트리가 비어있지 않다면 탐색한다.
		// 노드의 '탐색 순서 번호'를 관리
		Queue<Integer> queue = new LinkedList<Integer>(); // Queue의 구현체로는 LinkedList 사용. Queue 인터페이스에 정의된 행동만 하기 위해서
															// 참조변수는 Queue 타입으 로
		queue.offer(1);

		int current; // 탐색 순서 변수
		// Queue가 차있는 한
		while (!queue.isEmpty()) {
			current = queue.poll(); // 현재 queue에 남아있는 애 중 너바가 가장 작은 애가 나온다.
			System.out.println(nodes[current]);
			if (current * 2 <= lastIndex) // 왼쪽 자식이 있다면
				queue.offer(current * 2); // 순서 큐에 넣어준다.
			if (current * 2 + 1 <= lastIndex) // 오른쪽 자식이 있다면
				queue.offer(current * 2 + 1); // 순서 큐에 넣어준다.
		}

	}

	// BFS 탐색 (Level 별로 출력)
	public void bfs2() {
		// 트리가 비어있다면 탐색하지 않는다.
		if (isEmpty())
			return;

		// 트리가 비어있지 않다면 탐색한다.
		// 노드의 '탐색 순서 번호'를 관리
		Queue<Integer> queue = new LinkedList<Integer>(); // Queue의 구현체로는 LinkedList 사용. Queue 인터페이스에 정의된 행동만 하기 위해서
		// 참조변수는 Queue 타입으로
		queue.offer(1); // 루트 노드 삽입

		int current; // 탐색 순서 변수
		int size, level = 0;

		// Queue가 차있는 한
		while (!queue.isEmpty()) {

			size = queue.size();
			System.out.print("level" + level + ": ");

			while (--size >= 0) { // size만큼의 횟수로 poll
				current = queue.poll(); // 현재 queue에 남아있는 애 중 너바가 가장 작은 애가 나온다.
				System.out.print(nodes[current] + " ");
				if (current * 2 <= lastIndex) // 왼쪽 자식이 있다면
					queue.offer(current * 2); // 순서 큐에 넣어준다.
				if (current * 2 + 1 <= lastIndex) // 오른쪽 자식이 있다면
					queue.offer(current * 2 + 1); // 순서 큐에 넣어준다.
			}
			System.out.println();
			++level;
		}
	}

	// DFS 탐색 (전위 순회)
	public void dfs(int current) { // current: 현재 노드

		if (current > lastIndex)
			return;

		System.out.println(nodes[current]);
		dfs(current * 2);
		dfs(current * 2 + 1);
	}
	
	

	// 중위 순회
	public void dfs2(int current) { // current: 현재 노드

		if (current > lastIndex)
			return;

		dfs2(current * 2);
		System.out.println(nodes[current]);
		dfs2(current * 2 + 1);
	}
	
	// 후위 순회
	public void dfs3(int current) { // current: 현재 노드

		if (current > lastIndex)
			return;

		dfs3(current * 2);
		dfs3(current * 2 + 1);
		System.out.println(nodes[current]);
	}
}
