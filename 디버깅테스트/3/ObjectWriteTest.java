import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {
	public static void main(String[] args) throws Exception{
		
		Person p = new Person("홍길동", 13, "학생");
		
		
		// 객체 직렬화: 객체를 파일에 쓰기
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.ser"));
		oos.writeObject(p);
		oos.writeInt(1004);
		oos.writeObject(new Person("김주원", 15, "학생"));
		oos.close();
		
		System.out.println("객체를 파일에 쓰기 성공");
		
	}
}
