package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id;
		int password;

		Scanner sc = new Scanner(System.in);

		System.out.println("ID �Է�: ");
		id = sc.next();
		System.out.println("password �Է�: ");
		password = sc.nextInt();

		if (!id.equals("tis")) { //���ڿ� �� �� equals() ���   // ==, != <-�̰� �ּҰ� ��
			// ����ó��
			// ID�� ����ġ�մϴ�.
			try {
				throw new LoginIdException("ID�� ����ġ�մϴ�.");
			} catch (LoginIdException e) {
				System.out.println("iD�� �ٽ� �Է��ϼ���");
			}
		}
		
		if (password != 1234) {
			try {
				throw new LoginPwException("password�� ����ġ�մϴ�.");
			} catch (LoginPwException e) {
				//e.printStackTrace();
				System.out.println("password�� �ٽ� �Է��ϼ���");
			}
		}

		if (id.equals("tis") && password == 1234) {
			System.out.println("�α��� ����");
		}
	}

}