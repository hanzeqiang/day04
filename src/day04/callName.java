package day04;

import java.util.Random;

/*
 * ���������
 * 1���洢����
 * 2��Ԥ��������
 * 3�������һ��������
 */
public class callName {
	public static void main(String[] args) {
		//�洢����������
		String[] name={"����","����","����","����","����","��ǿ","aimy","soony","wnagyu","����6","������"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		Random random=new Random();
		int s=random.nextInt(name.length);
		System.out.println("�������Ϊ:"+name[s]);
	}

}
