package demo;

public class Demo1 {

	private int count = 10;
	// new一个当做锁的对象
	Object object = new Object();

	public void m() {

		synchronized (object) {

			count--;
			System.out.println(Thread.currentThread().getName() + "count=" + count);

		}

	}

}
