
public class CompleteBinaryTreeTest {

	public static void main(String[] args) {
		int size = 9;
		CompleteBinaryTree tree = new CompleteBinaryTree(size);

		for (int i = 0; i < size; i++) {
			tree.add((char) (65 + i)); // A는 65, 형변환하면 문자 저장
		}

		tree.bfs1();

		tree.bfs2();
		
		tree.dfs(1);
		tree.dfs2(1);
		tree.dfs3(1);

	}
}
