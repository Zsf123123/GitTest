package com.itheima.test02;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 多线程的第二种实现方式: 实现Runnable接口.
		 * 	1. 定义一个类(MyRunnable)去实现Runnable接口.
		 *  2. 重写Runnable#run(), 把要执行的代码写到run()中.
		 *  3. 创建Runnable接口的子类对象, 将其作为参数传入Thread类的构造, 创建线程对象.
		 *  4. 开启线程.
		 *  
		 *  多线程的执行特点: 随机性, 延迟性. 原因是因为CPU在做着高效的切换.
		 */
		// 创建Runnable接口的子类对象,
		MyRunnable mr = new MyRunnable();
		//将其作为参数传入Thread类的构造, 创建线程对象.
		Thread th = new Thread(mr);
		th.start(); //这里调用的式Thread#start(), 理论上来讲, 调用的应该式Thread#run(),
				   // 为什么, 最终执行的结果居然是执行的 MyRunnable#run()?
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main....." + i);
		}
	}
}
