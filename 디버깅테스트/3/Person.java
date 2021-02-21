import java.io.Serializable;

public class Person implements Serializable{
	// 객체 직렬화 가능한 객체 입니다!
	
	String name;
	int age;
	String job;

	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	
}
