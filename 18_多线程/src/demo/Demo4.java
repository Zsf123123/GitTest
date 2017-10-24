package demo;

public class Demo4 {

	
	static Demo4 demo4=new Demo4();
	// Ä£ÄâÏß³ÌËÀËø
	Object a = new Object();
	Object b = new Object();

	public   void m1() throws Exception {

		synchronized (a) {
			System.out.println("m1aa");
			Thread.sleep(5000);

			synchronized (b) {
				System.out.println("m1bb");
			}

		}

	}

	public void m2() throws Exception {
		synchronized (b) {

			System.out.println("m2bb");
			Thread.sleep(5000);
		
			synchronized (a) {
				System.out.println("m2aa");
			}
		}

	}

	
	public static void main(String[] args) {
		
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				try {
					demo4.m1();
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
					demo4.m2();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		
	}

	
}
