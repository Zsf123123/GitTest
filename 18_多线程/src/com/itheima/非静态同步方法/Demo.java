package com.itheima.非静态同步方法;

public class Demo {
	/*
	 * 该类中有method1() 和 method2()两个方法, 
	 * method1()方法采用同步方法,  method2()方法采用同步代码块的方式
	 * 只要两个方法打印的结果不出现乱序情况, 就说明锁对象式一致的.
	 * 
	 * 非静态同步方法的锁对象是: this.
	 */
	
	public synchronized void method1() {
		System.out.print("黑");
		System.out.print("马");
		System.out.print("程");
		System.out.print("序");
		System.out.print("员");
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
