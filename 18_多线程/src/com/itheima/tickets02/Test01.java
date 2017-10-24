package com.itheima.tickets02;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 实现Runnable接口的方式: 实现模拟卖票案例
		 */
		//创建Runnable接口的子类对象
		MyRunnable mr = new MyRunnable();
		
		//创建线程对象
		Thread th1 = new Thread(mr,"窗口1");
		Thread th2 = new Thread(mr,"窗口2");
		Thread th3 = new Thread(mr,"窗口3");
		Thread th4 = new Thread(mr,"窗口4");
		
		//开启线程
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
