package day04;

import sun.security.util.Length;

/*
 * �������飺
 * ��������������Ҫ�أ�ǿ��������������
 * ����Ҫ���������͡���С���洢���ݵĸ���
 * �������鹫ʽ��
 * ��������[] ������=new ��������[�洢Ԫ�صĸ���]
 * ������һ���������洢���е�ÿ��Ԫ�ض����Լ����Զ����
 * �Զ���ţ���СֵΪ0���ֵΪlength-1
 * �Զ����רҵ����������index��
 * �������ݴ洢��Ԫ�أ�����������������ʽ  ��������������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		
	
int[] a=new int[1000];//�൱�����ڴ��ж�����10��,a��ʾ�������ڴ��еĵ�ַ
System.out.println(a);
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[4]);
System.out.println(a[a.length-1]);
}}
