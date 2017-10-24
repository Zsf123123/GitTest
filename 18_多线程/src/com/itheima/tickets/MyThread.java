package com.itheima.tickets;

public class MyThread extends Thread{
	//����100��Ʊ
	static int tickets = 100;
	
	//���췽��
	public MyThread() {
		super();
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		//��Ϊ��֪��ʲôʱ������, ������while(true)
		//�߳�1, �߳�2, �߳�3, �߳�4
		while(true) {
			synchronized (MyThread.class) {
				if (tickets < 1) {
					break;
				}
				
				//�ó���ִ�е��ٶ���һ��, �����߳�
				try {
					Thread.sleep(50);   //�߳�1, �߳�2, �߳�3, �߳�4
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//��������Ʊ����   
				//�߳�1, �߳�2, �߳�3, �߳�4
				System.out.println(getName() + "���ڳ��۵�" + tickets-- + "��Ʊ");
			}
		}
	}

	
}
