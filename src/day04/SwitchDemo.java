package day04;
/*
 * Switch(表达式)
 * case 常量
 * 要执行语句
 * break;
 * JDK1.5  接受的数据类型 byte  short int char enum
 * JDK1.7  接受的数据类型 byte  short int char enum  String       
 */
public class SwitchDemo {
	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			
		switch (j) {
		case 1:
			System.out.println("这是1");
			break;
		case 2:
			System.out.println("这是2");
		default:
			System.out.println(j);
			break;
		}
	}
	}
}
