package com.itheima.test02;

//1. 定义一个类(MyRunnable)去实现Runnable接口.
public class MyRunnable implements Runnable {

	//2. 重写Runnable#run(), 把要执行的代码写到run()中.
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("run***********" + i);
		}
	}

}
