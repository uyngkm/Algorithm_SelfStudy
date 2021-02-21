import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.ser"));
		Person p1 = (Person) ois.readObject(); // 자식으로 캐스팅(Person: 자식, Object: 부모)
		int su = ois.readInt();
		Person p2 = (Person) ois.readObject(); // 자식으로 캐스팅
		
		// write한 순서대로 read 해야한다!
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(su);
	}
}
