package com.itheima.test01;

//1. 定义一个类(MyThread)去继承Thread.
public class MyThread extends Thread{
	
	public MyThread() {
		super();
	}

	//2. 重写Thread#run(), 把要执行的代码写到run()中.
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("Java********************" + i);
		}
	}
}

