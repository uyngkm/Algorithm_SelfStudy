
public class Test2 {
	public static void main(String[] args) {
		
		B b1 = B.getInstance(); //new B();
		B b2 = B.getInstance(); //new B();
		B b3 = B.getInstance(); //new B();
		// 참조 못하도록 막는다.
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		// 같은 메모리를 바라보게 하는 것이 Singleton
		
	}
}
