package exceptionProject;

public class ObjectTest { //API 가서 둘러보기

	public static void main(String[] args) {
		Person p1 = new Person("홍길동",10);
		Person p2 = new Person("홍길동",10);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if(p1.equals(p2)) { // "홍길동" == "홍길동" && 10 == 10
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}

	}

}