package com.itheima.�Ǿ�̬ͬ������;

public class Demo {
	/*
	 * ��������method1() �� method2()��������, 
	 * method1()��������ͬ������,  method2()��������ͬ�������ķ�ʽ
	 * ֻҪ����������ӡ�Ľ���������������, ��˵��������ʽһ�µ�.
	 * 
	 * �Ǿ�̬ͬ����������������: this.
	 */
	
	public synchronized void method1() {
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("Ա");
		System.out.println();
	}

	public void method2() {
		synchronized (this) {
			System.out.print("i");
			System.out.print("t");
			System.out.print("c");
			System.out.print("a");
			System.out.print("s");
			System.out.print("t");
			System.out.println();
		}
	}
}
