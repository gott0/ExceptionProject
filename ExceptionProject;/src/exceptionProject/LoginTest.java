package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id;
		int password;

		Scanner sc = new Scanner(System.in);

		System.out.println("ID 입력: ");
		id = sc.next();
		System.out.println("password 입력: ");
		password = sc.nextInt();

		if (!id.equals("tis")) { //문자열 비교 시 equals() 사용   // ==, != <-이건 주소값 비교
			// 예외처리
			// ID가 불일치합니다.
			try {
				throw new LoginIdException("ID가 불일치합니다.");
			} catch (LoginIdException e) {
				System.out.println("iD를 다시 입력하세요");
			}
		}
		
		if (password != 1234) {
			try {
				throw new LoginPwException("password가 불일치합니다.");
			} catch (LoginPwException e) {
				//e.printStackTrace();
				System.out.println("password를 다시 입력하세요");
			}
		}

		if (id.equals("tis") && password == 1234) {
			System.out.println("로그인 성공");
		}
	}

}