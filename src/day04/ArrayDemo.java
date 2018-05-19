package day04;

import sun.security.util.Length;

/*
 * 定义数组：
 * 定义数据容器，要素，强制数据类型语言
 * 必须要有数据类型、大小、存储数据的个数
 * 定义数组公式：
 * 数据类型[] 变量名=new 数据类型[存储元素的个数]
 * 数组是一个容器，存储组中的每个元素都有自己的自动编号
 * 自动编号，最小值为0最大值为length-1
 * 自动编号专业名词索引（index）
 * 访问数据存储的元素，必须依赖索引，公式  数组名【索引】
 */
public class ArrayDemo {
	public static void main(String[] args) {
		
	
int[] a=new int[1000];//相当于在内存中定义了10个,a表示数组在内存中的地址
System.out.println(a);
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[4]);
System.out.println(a[a.length-1]);
}}
