package day04;

import java.util.Random;

/*组操作中，常见异常
 * 1、数组越界异常
 * 2、空指针异常
 * 
 */
public class ArrayDemo_3 {
	public static void main(String[] args) {
		//int[] arr={5,2,3};
	//System.out.println(arr[3]);
	
//空指针异常
	int[] arr1={5,2,3};
	System.out.println(arr1[2]);
	arr1=null;//arr1为空
	System.out.println(arr1[2]);//空指针异常
}
}