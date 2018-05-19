package day04;
//公司销售总和运算
public class ArrayArrayLearn {
public static void main(String[] args) {
	int[][] arr={{11,12},{21,22,33},{31,32,33,34}};
	int sum=0;
	int groupSum=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			groupSum+=arr[i][j];
		}
		System.out.println("第"+arr[i].length+"小组销售额为:"+groupSum);
		//每个一维数组清空
		
		sum+=groupSum;
		groupSum=0;
	}	
	System.out.println("公司2018销售额为:"+sum+"万元");
	
}
}
