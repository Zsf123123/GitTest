package com.itheima.test001;

//通过继承Thread类

public class MyThread extends Thread {

	// 重写run方法

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println(i);

		}

	}

}
