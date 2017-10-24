package com.itheima.静态同步方法;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 1. 创建两个线程对象.
		 * 2. 一个线程对象调用method1(), 另一个线程对象调用method2().
		 * 3. 为了让结果更加明显, 用while(true)改进.
		 * 
		 */
		
		//通过匿名内部类的方式创建多线程对象
		new Thread() {
			@Override
			public void run() {
				while(true) {
					Demo.method1();
				}
			}
		}.start();
		
		
		//通过匿名内部类的方式创建多线程对象
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
