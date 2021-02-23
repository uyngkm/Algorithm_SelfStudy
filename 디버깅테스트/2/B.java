
public class B {
	
	// 너 기본 생성자 호출하지 마
	private B() {
		
	}

//	// 해결책 1.
//	private static B instance= new B();
//	
//	public static B getInstance() {
//		return instance;
//	}
//	// B를 인스턴스라고 한다.
//	// 인스턴스를 어디서나 가지고 갈 수 있도록
	
	
	// 해결책 2.
	private static B instance; // 기본값 NULL
	
	public static B getInstance() {
		if(instance == null) {
			instance = new B();
		}
		
		return instance;
	}
	// 최초로 호출 된다면 
	// 그 다움 호출 된다면

}
