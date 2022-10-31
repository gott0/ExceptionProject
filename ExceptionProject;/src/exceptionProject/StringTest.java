package exceptionProject;

public class StringTest {

	public static void main(String[] args) {
		
		//charAt()
		//subString()
		//indexOf()
		//equals()
		//valueOf()
		
		
		
//		String str1 = "abc"; //대부분 이런 방식을 씀                            
//		String str2 = "abc"; //같은 값을 가진 문자열의 주소을 받음
		   
		
//		String str1 = "abc";                           
//		String str2 = "def"; 
//		   //   └변수들이 받는 것은 주소값이다
//		str1 = str1 + str2; // "abcdef" // 새로운 주소의 데이터가 생기고 str1은 새로운 주소에 할당되어 주소값이 변함
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//
//		String str3 = new String("abc");
//		String str4 = new String("abc"); // 서로 다르 주소로 다른 값을 받음.
//
//		
//		if(str3.equals(str4)){ // => 문자열을 비교  // "abc".equals("abc")도 가능
//			//문자열
//			System.out.println("같은 문자열이다.");
//		} else {System.out.println("다른 문자열이다");
//		}
//		
//		
//		if(str3 == str4){// => 주소값을 비교(비교연산자 사용 시)
//			//주소값
//			System.out.println("같은 문자열이다.");
//		} else {System.out.println("다른 문자열이다");
//		}
		
		
//		int x = 10;
//		String str = String.valueOf(x); // .valueOf(x);  => "10" 숫자를 문자로 반환
//    	System.out.println(str.charAt(0));  // 1
		
		
//		String fileName = "Hello.java"; // Hello java
//		              //   0123456789
//		
//		int index = fileName.indexOf('.'); // 내가 알고싶은 문자를 넣으면 위치값(인덱스 값)이 반환  => 5
//		System.out.println(index);             // ┌인자(인덱스)값 -1까지의 글자까지 출력
//		System.out.println(fileName.substring(0,index)); // Hello
//		System.out.println(fileName.substring(index + 1)); //java
//		                                       // └마직막 글자까지 출력하고싶기 때문에 후방 인자를 적어줄 필요 없음
		
		
		
		
		
//	char c = fileName.charAt(0); //'H'
//	System.out.println(c);
//	
//	for (int i=0; i<fileName.length(); i++) {
//		System.out.println(fileName.charAt(i));
//	}
	
//	String str = fileName.substring(0,5);
//	System.out.println(str);
//	String str2 = fileName.substring(6,10);
//	System.out.println(str2);
//	String str3 = fileName.substring(3);
//	System.out.println(str3);
		
		
     //StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다. (새로운 데이터를 만드는 것이 아니라 기존의 데이터에 추가하는 형식)
//		StringBuffer sb = new StringBuffer("abc"); // StringBuffer는 생성을 해서 사용
//		System.out.println(sb);
//		sb.append("def");
//		System.out.println(sb);
		
		
	}
}