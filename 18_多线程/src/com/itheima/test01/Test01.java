package com.itheima.test01;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * ���̵߳�ʵ�ַ�ʽ:
		 * 	��ʽһ: �̳�Thread��.
		 * 		1. ����һ����(MyThread)ȥ�̳�Thread.
		 * 		2. ��дThread#run(), ��Ҫִ�еĴ���д��run()��.
		 * 		3. �����̶߳���.
		 * 		4. �����߳�.
		 * 		 ע��:
		 * 			a.�����̵߳��õ���start().
		 * 			b.ͬһ�̲߳����ظ�����, ����ᱨ"�߳�״̬�Ƿ��쳣".
		 * 			IllegalThreadStateException
		 * 
		 *  ���õ���:  public Thread();
		 * 
		 * ���̵߳�ִ�о���: �����, �ӳ���.
		 */
		
		//3. �����̶߳���.
		MyThread mt = new MyThread();
		// mt.run(); //��ôд���򲻻ᱨ��(û���﷨����), ���ǲ��Ƕ��̳߳���.
		mt.start();
				
				
		for (int i = 0; i < 200; i++) {
			System.out.println("main...." + i);
		}
		
		
	}
}
