package com.itheima.test001;

public class Test002 {

	
	public static void main(String[] args) {
	
		
		//ʹ�������ڲ��� ʵ�ֽӿڵ�ʵ����
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<100;i++) {
					
					System.out.println("�߳�");
				
				}
			}
		
		}).start();
		
		
		//�ڵ��ù��췽����ʱ��ʵ����Runable�ӿڵ��������ȥ
		//֮��ʹ��thread��start()���Ὺ��һ���߳�
		for(int i=0;i<100;i++) {
	
			System.out.println("main");
		}
		
		
	}
	
}
