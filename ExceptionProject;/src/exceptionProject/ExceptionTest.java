package exceptionProject;

public class ExceptionTest {

	public static void main(String[] args) {

		// ����ó��: ���� �� �ڵ�󿡼� �����ڰ� ������ �� �ִ� �������� �ذ��ϴ� ��

//		try {
//			���๮; // ���ܸ� �߻���ų �� �ִ� ����
//		} catch(����Ÿ��) {
//			���� ó�� ����
//		}

		//Exception
		
//		for (int i = 0; i < 100; i++) {
//			try {
//				int r = (int) (Math.random() * 10); // 0~9
//				System.out.println(r);
//				int result = 10 / r;          // ������ 0���� ���� �� ����.���ܹ߻�
//			} catch (ArithmeticException e) {
//				System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
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
//			System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index number ����");
//			   // �� ���� �ֻ��� Ÿ��	
//		}catch(Exception e) {
//			System.out.println("��翹�� ó��");
//		}finally {
//			//���ܹ߻� ������ ������� �����ϴ� ����
//			System.out.println("���ܹ߻� ������ ������� �����ϴ� ����");
//		}
//	
//		arr[3] = 10;
//		System.out.println(arr[3]);
//
//		try {
//			throw new Exception("���Ƿ� ���� �߻�"); //���� ������
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

		add();

		//catch�� Ÿ��
		//throw���� ��������
		//throw���� ���� ����
		
		try {
			sub();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	} // main() end

	static void add() {
		try {
			throw new Exception("add() ���ܹ߻�");
		}catch(Exception e) {
			e.printStackTrace();
		}
	} //add() end
	
	static void sub() throws ArithmeticException { //���� �����ϱ�
		throw new ArithmeticException("sub() ���ܹ߻�");
	}
}