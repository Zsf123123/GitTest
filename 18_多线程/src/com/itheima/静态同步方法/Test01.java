package com.itheima.��̬ͬ������;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 1. ���������̶߳���.
		 * 2. һ���̶߳������method1(), ��һ���̶߳������method2().
		 * 3. Ϊ���ý����������, ��while(true)�Ľ�.
		 * 
		 */
		
		//ͨ�������ڲ���ķ�ʽ�������̶߳���
		new Thread() {
			@Override
			public void run() {
				while(true) {
					Demo.method1();
				}
			}
		}.start();
		
		
		//ͨ�������ڲ���ķ�ʽ�������̶߳���
		new Thread() {
			@Override
			public void run() {
				while(true) {
					Demo.method2();
				}
			}
		}.start();
	}
}
