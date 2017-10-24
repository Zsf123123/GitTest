package com.itheima.tickets02;

public class MyRunnable implements Runnable{
	//创建一份100张票
	int tickets = 100;

	@Override
	public void run() {
		//模拟卖票
		while(true) {
			synchronized (this) {
				//结束售票
				if (tickets < 1) {
					break;
				}
				
				//让线程执行的速度慢一点
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//正常的卖票逻辑
				System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets-- + "张票");
			}
		}
	}

}
