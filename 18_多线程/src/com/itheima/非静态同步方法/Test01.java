package com.itheima.�Ǿ�̬ͬ������;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 1. ���������̶߳���.
		 * 2. һ���̶߳������method1(), ��һ���̶߳������method2().
		 * 3. Ϊ���ý����������, ��while(true)�Ľ�.
		 * 
		 * �����ڲ�����������ڷ����ľֲ�����ʱ, �ñ��������final����, ԭ����Ϊ���ӳ��ñ�������������.
		 * ����JDK1.8�Ժ�ȡ��������¶�(���Զ�����final), ��������Ϊ����һ��Bug.
		 */
		
		//����Demo���͵Ķ���
		Demo demo = new Demo();
		
		//ͨ�������ڲ���ķ�ʽ�������̶߳���
		new Thread() {
			@Override
			public void run() {
				while(true) {
					demo.method1();
				}
			}
		}.start();
		
		
		//ͨ�������ڲ���ķ�ʽ�������̶߳���
		new Thread() {
			@Override
			public void run() {
				while(true) {
					demo.method2();
				}
			}
		}.start();
	}
}
