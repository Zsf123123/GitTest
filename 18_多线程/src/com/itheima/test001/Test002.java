package com.itheima.test001;

public class Test002 {

	
	public static void main(String[] args) {
	
		
		//使用匿名内部类 实现接口的实现类
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<100;i++) {
					
					System.out.println("线程");
				
				}
			}
		
		}).start();
		
		
		//在调用构造方法的时候将实现了Runable接口的类给传过去
		//之后使用thread的start()将会开启一个线程
		for(int i=0;i<100;i++) {
	
			System.out.println("main");
		}
		
		
	}
	
}
