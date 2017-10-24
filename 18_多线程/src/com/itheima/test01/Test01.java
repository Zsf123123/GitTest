package com.itheima.test01;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 多线程的实现方式:
		 * 	方式一: 继承Thread类.
		 * 		1. 定义一个类(MyThread)去继承Thread.
		 * 		2. 重写Thread#run(), 把要执行的代码写到run()中.
		 * 		3. 创建线程对象.
		 * 		4. 开启线程.
		 * 		 注意:
		 * 			a.开启线程调用的是start().
		 * 			b.同一线程不能重复开启, 否则会报"线程状态非法异常".
		 * 			IllegalThreadStateException
		 * 
		 *  调用的是:  public Thread();
		 * 
		 * 多线程的执行具有: 随机性, 延迟性.
		 */
		
		//3. 创建线程对象.
		MyThread mt = new MyThread();
		// mt.run(); //这么写程序不会报错(没有语法问题), 但是不是多线程程序.
		mt.start();
				
				
		for (int i = 0; i < 200; i++) {
			System.out.println("main...." + i);
		}
		
		
	}
}
