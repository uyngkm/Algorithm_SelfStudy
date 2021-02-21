
public class Problem {
	A a; // null
	int su; // 0

	// 생성자: 멤버에 대한 초기화 메소드, 가장 먼저 한번 호출
	public Problem() {
		a = new A();////
		
		su = 100;

	}

	void method() {
		a.hello(); // null.hello();
	}
}
