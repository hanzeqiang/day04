package day04;

public class ArrayArrayDemo_2 {
	public static void main(String[] args) {
		
	
	int[][] arr={{1,2},{3,6,8},{3,6,9,2,8}};
	//��ѭ��������ÿһ��һά����Ԫ��
	for (int i = 0; i < arr.length; i++) {
		//��ѭ����������ά����arr[0]  arr[i]
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println(arr[i][j]);
			
		}
		
	}

}
}
