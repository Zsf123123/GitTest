package com.itheima.test02;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * ���̵߳ĵڶ���ʵ�ַ�ʽ: ʵ��Runnable�ӿ�.
		 * 	1. ����һ����(MyRunnable)ȥʵ��Runnable�ӿ�.
		 *  2. ��дRunnable#run(), ��Ҫִ�еĴ���д��run()��.
		 *  3. ����Runnable�ӿڵ��������, ������Ϊ��������Thread��Ĺ���, �����̶߳���.
		 *  4. �����߳�.
		 *  
		 *  ���̵߳�ִ���ص�: �����, �ӳ���. ԭ������ΪCPU�����Ÿ�Ч���л�.
		 */
		// ����Runnable�ӿڵ��������,
		MyRunnable mr = new MyRunnable();
		//������Ϊ��������Thread��Ĺ���, �����̶߳���.
		Thread th = new Thread(mr);
		th.start(); //������õ�ʽThread#start(), ����������, ���õ�Ӧ��ʽThread#run(),
				   // Ϊʲô, ����ִ�еĽ����Ȼ��ִ�е� MyRunnable#run()?
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main....." + i);
		}
	}
}
