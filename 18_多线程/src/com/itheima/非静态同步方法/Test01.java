package com.itheima.非静态同步方法;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 1. 创建两个线程对象.
		 * 2. 一个线程对象调用method1(), 另一个线程对象调用method2().
		 * 3. 为了让结果更加明显, 用while(true)改进.
		 * 
		 * 匿名内部类访问其所在方法的局部变量时, 该变量必须加final修饰, 原因是为了延长该变量的声明周期.
		 * 但是JDK1.8以后取消了这个事儿(会自动加上final), 所以我认为这是一个Bug.
		 */
		
		//创建Demo类型的对象
		Demo demo = new Demo();
		
		//通过匿名内部类的方式创建多线程对象
		new Thread() {
			@Override
			public void run() {
				while(true) {
					demo.method1();
				}
			}
		}.start();
		
		
		//通过匿名内部类的方式创建多线程对象
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
