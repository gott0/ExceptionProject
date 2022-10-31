package exceptionProject;

public class Person {
	String name;
	int age;

	public Person(String name ,int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override
	public boolean equals(Object obj) { //멤버변수의 값이 같은지 비교하는 메소드
		if(obj instanceof Person) {
			Person another = (Person)obj;
			return this.name.equals(another.name) && this.age == another.age;
		}
		return false;
	}



	@Override
	public int hashCode() { // 해쉬코드를 동일하게 만드는 오버라이징
		
		return (this.name + age).hashCode(); // "홍길동10".hashCode()  => 같은 문자열 = 같은 해쉬코드
	}         //해당 문자열이면 동일한 문자열일 경우  동일한 해쉬코드를  리턴

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}