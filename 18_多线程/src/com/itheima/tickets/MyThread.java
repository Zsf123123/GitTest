package com.itheima.tickets;

public class MyThread extends Thread{
	//定义100张票
	static int tickets = 100;
	
	//构造方法
	public MyThread() {
		super();
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		//因为不知道什么时候卖完, 所以用while(true)
		//线程1, 线程2, 线程3, 线程4
		while(true) {
			synchronized (MyThread.class) {
				if (tickets < 1) {
					break;
				}
				
				//让程序执行的速度慢一点, 休眠线程
				try {
					Thread.sleep(50);   //线程1, 线程2, 线程3, 线程4
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//正常的售票过程   
				//线程1, 线程2, 线程3, 线程4
				System.out.println(getName() + "正在出售第" + tickets-- + "张票");
			}
		}
	}

	
}
