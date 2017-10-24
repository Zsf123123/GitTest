package com.itheima.tickets;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 用继承Thread类的方式实现: 模拟火车站售票的过程.
		 * 100张票  分 4个窗口卖.
		 * 
		 * 多线程模拟卖票案例出现的问题:
		 * 	出现负值:
		 * 	出现重复值: tickets--
		 * 		tickets = tickets - 1;
		 * 					66    - 1
		 */
		
		//分四个窗口卖, 其实就是创建4个线程对象
		MyThread mt1 = new MyThread("窗口1");
		//mt1.setName("窗口1");
		MyThread mt2 = new MyThread("窗口2");
		MyThread mt3 = new MyThread("窗口3");
		MyThread mt4 = new MyThread("窗口4");
		
		//开启线程
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}
}
