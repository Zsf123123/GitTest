package com.itheima.test01;

//1. ����һ����(MyThread)ȥ�̳�Thread.
public class MyThread extends Thread{
	
	public MyThread() {
		super();
	}

	//2. ��дThread#run(), ��Ҫִ�еĴ���д��run()��.
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("Java********************" + i);
		}
	}
}

