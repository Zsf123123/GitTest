package com.itheima.tickets02;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * ʵ��Runnable�ӿڵķ�ʽ: ʵ��ģ����Ʊ����
		 */
		//����Runnable�ӿڵ��������
		MyRunnable mr = new MyRunnable();
		
		//�����̶߳���
		Thread th1 = new Thread(mr,"����1");
		Thread th2 = new Thread(mr,"����2");
		Thread th3 = new Thread(mr,"����3");
		Thread th4 = new Thread(mr,"����4");
		
		//�����߳�
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
