package day04;
//��˾�����ܺ�����
public class ArrayArrayLearn {
public static void main(String[] args) {
	int[][] arr={{11,12},{21,22,33},{31,32,33,34}};
	int sum=0;
	int groupSum=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			groupSum+=arr[i][j];
		}
		System.out.println("��"+arr[i].length+"С�����۶�Ϊ:"+groupSum);
		//ÿ��һά�������
		
		sum+=groupSum;
		groupSum=0;
	}	
	System.out.println("��˾2018���۶�Ϊ:"+sum+"��Ԫ");
	
}
}
