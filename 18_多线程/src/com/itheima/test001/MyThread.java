package com.itheima.test001;

//ͨ���̳�Thread��

public class MyThread extends Thread {

	// ��дrun����

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println(i);

		}

	}

}
