package com.itheima.��̬ͬ������;

public class Demo {
	/*
	 * ��������method1() �� method2()��������, 
	 * method1()��������ͬ������,  method2()��������ͬ�������ķ�ʽ
	 * ֻҪ����������ӡ�Ľ���������������, ��˵��������ʽһ�µ�.
	 * 
	 * ��̬ͬ����������������: ������ֽ����ļ�����(������.class).
	 */
	
	public synchronized static void method1() {
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("Ա");
		System.out.println();
	}

	public static void method2() {
		synchronized (Demo.class) {
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
