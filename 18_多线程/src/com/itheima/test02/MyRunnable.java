package com.itheima.test02;

//1. ����һ����(MyRunnable)ȥʵ��Runnable�ӿ�.
public class MyRunnable implements Runnable {

	//2. ��дRunnable#run(), ��Ҫִ�еĴ���д��run()��.
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("run***********" + i);
		}
	}

}
