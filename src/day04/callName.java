package day04;

import java.util.Random;

/*
 * 随机点名器
 * 1、存储姓名
 * 2、预览所有人
 * 3、随机出一个人姓名
 */
public class callName {
	public static void main(String[] args) {
		//存储姓名到数组
		String[] name={"张三","李四","王五","寒气","刘飞","韩强","aimy","soony","wnagyu","刘飞6","赵娜妹"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		Random random=new Random();
		int s=random.nextInt(name.length);
		System.out.println("随机点名为:"+name[s]);
	}

}
