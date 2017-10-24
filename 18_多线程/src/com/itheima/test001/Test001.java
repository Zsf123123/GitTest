package com.itheima.test001;

public class Test001 {

	public static void main(String[] args) {
		
		//调用start()开启一个线程
		MyThread myThread = new MyThread();
		myThread.start();
		
		for(int i=0;i<100;i++) {
		
			System.out.println("main");
		}
		
		
	}
	
	
}
