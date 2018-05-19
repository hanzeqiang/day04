package day04;
/*
 *二维数组
 * 数组中的数组，数组里面存储的还是数组
 * 定义方式和一维数组类似
 */
public class ArrayArrayDemo {
	public static void main(String[] args) {
		int[][] arrarr=new int[3][4];//定义二维数组。[3]二位数组中有三个一维数组。【4】三个一维数组每个数组长度是4
		System.out.println(arrarr);
		System.out.println(arrarr[1]);
		System.out.println(arrarr[1][1]);
	}

}
