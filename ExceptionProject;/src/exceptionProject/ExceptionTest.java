package exceptionProject;

public class ExceptionTest {

	public static void main(String[] args) {

		// 예외처리: 실행 시 코드상에서 개발자가 인지할 수 있는 문제점을 해결하는 것

//		try {
//			실행문; // 예외를 발생시킬 수 있는 구문
//		} catch(예외타입) {
//			예외 처리 구문
//		}

		//Exception
		
//		for (int i = 0; i < 100; i++) {
//			try {
//				int r = (int) (Math.random() * 10); // 0~9
//				System.out.println(r);
//				int result = 10 / r;          // 점수를 0으로 나눌 수 없다.예외발생
//			} catch (ArithmeticException e) {
//				System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
//			}
//		}

//		int[] arr = new int[5]; // 0 ~ 4
//		
//		try {
//			int r = (int) (Math.random() * 10); // 0~9
//			System.out.println(r);
//			int result = 10 / r;
//			
//			arr[5] = 10;
//			   
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index number 오류");
//			   // ┌ 예외 최상위 타입	
//		}catch(Exception e) {
//			System.out.println("모든예외 처리");
//		}finally {
//			//예외발생 유무와 상관업이 실행하는 구문
//			System.out.println("예외발생 유무와 상관업이 실행하는 구문");
//		}
//	
//		arr[3] = 10;
//		System.out.println(arr[3]);
//
//		try {
//			throw new Exception("고의로 예외 발생"); //예외 던지기
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

		add();

		//catch문 타입
		//throw에서 강제예외
		//throw에서 예외 선언
		
		try {
			sub();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	} // main() end

	static void add() {
		try {
			throw new Exception("add() 예외발생");
		}catch(Exception e) {
			e.printStackTrace();
		}
	} //add() end
	
	static void sub() throws ArithmeticException { //예외 선언하기
		throw new ArithmeticException("sub() 예외발생");
	}
}