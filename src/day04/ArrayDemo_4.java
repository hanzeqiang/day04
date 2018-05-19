package day04;
/*
 * 数组获取最值的原理思想
 */
public class ArrayDemo_4 {
public static void main(String[] args) {
	int[] a={-2,5,6,9,2,11,26,369,146,235};
	int max=a[0];
	for(int i=1;i<a.length;i++){
		if(max>a[i]){//if(max<a[i])
			max=a[i];
		}
	}
		System.out.println(max);
}
}
