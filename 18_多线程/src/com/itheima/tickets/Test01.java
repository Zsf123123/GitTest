package com.itheima.tickets;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * �ü̳�Thread��ķ�ʽʵ��: ģ���վ��Ʊ�Ĺ���.
		 * 100��Ʊ  �� 4��������.
		 * 
		 * ���߳�ģ����Ʊ�������ֵ�����:
		 * 	���ָ�ֵ:
		 * 	�����ظ�ֵ: tickets--
		 * 		tickets = tickets - 1;
		 * 					66    - 1
		 */
		
		//���ĸ�������, ��ʵ���Ǵ���4���̶߳���
		MyThread mt1 = new MyThread("����1");
		//mt1.setName("����1");
		MyThread mt2 = new MyThread("����2");
		MyThread mt3 = new MyThread("����3");
		MyThread mt4 = new MyThread("����4");
		
		//�����߳�
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}
}
