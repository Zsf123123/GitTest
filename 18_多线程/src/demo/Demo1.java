package demo;

public class Demo1 {

	private int count = 10;
	// newһ���������Ķ���
	Object object = new Object();

	public void m() {

		synchronized (object) {

			count--;
			System.out.println(Thread.currentThread().getName() + "count=" + count);

		}

	}

}
