package com.itheima.tickets02;

public class MyRunnable implements Runnable{
	//����һ��100��Ʊ
	int tickets = 100;

	@Override
	public void run() {
		//ģ����Ʊ
		while(true) {
			synchronized (this) {
				//������Ʊ
				if (tickets < 1) {
					break;
				}
				
				//���߳�ִ�е��ٶ���һ��
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//��������Ʊ�߼�
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets-- + "��Ʊ");
			}
		}
	}

}
