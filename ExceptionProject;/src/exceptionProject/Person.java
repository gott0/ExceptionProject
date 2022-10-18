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
	public boolean equals(Object obj) { //��������� ���� ������ ���ϴ� �޼ҵ�
		if(obj instanceof Person) {
			Person another = (Person)obj;
			return this.name.equals(another.name) && this.age == another.age;
		}
		return false;
	}



	@Override
	public int hashCode() { // �ؽ��ڵ带 �����ϰ� ����� ��������¡
		
		return (this.name + age).hashCode(); // "ȫ�浿10".hashCode()  => ���� ���ڿ� = ���� �ؽ��ڵ�
	}         //�ش� ���ڿ��̸� ������ ���ڿ��� ���  ������ �ؽ��ڵ带  ����

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}