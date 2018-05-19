package day04;
/*
 * case 穿透性
 */
public class SwitchDemo_1 {
public static void main(String[] args) {
	int week=1;
	switch (week) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		System.out.println("工作日");
		break;
	case 6:
	case 7:
		System.out.println("休息日");
		break;
	}
}
}
