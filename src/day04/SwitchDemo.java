package day04;
/*
 * Switch(���ʽ)
 * case ����
 * Ҫִ�����
 * break;
 * JDK1.5  ���ܵ��������� byte  short int char enum
 * JDK1.7  ���ܵ��������� byte  short int char enum  String       
 */
public class SwitchDemo {
	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			
		switch (j) {
		case 1:
			System.out.println("����1");
			break;
		case 2:
			System.out.println("����2");
		default:
			System.out.println(j);
			break;
		}
	}
	}
}
