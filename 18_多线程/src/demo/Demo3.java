package demo;

public class Demo3 {

	// 枷锁的方法
	public static synchronized void m1() throws InterruptedException {
		System.out.println("开始执行m1了");
		Thread.sleep(10000);
		System.out.println("我是m1");

	}

	public static void m2() throws Exception {
		Thread.sleep(5000);
		System.out.println("我是m2");
	}

	public static void main(String[] args) {

	
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Demo3.m2();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				try {
					Demo3.m1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();
		
	}

}
