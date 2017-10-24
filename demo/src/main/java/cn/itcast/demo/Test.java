package cn.itcast.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ClientInfoStatus;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		
		
		//����fastFDFSD�������ļ� һ��Ҫ��ʵ��·��
		ClientGlobal.init("F:\\Project\\pinyougou\\demo\\src\\main\\resources\\fdfs_client.conf ");
		
		//�½�һ��TrackerClient �ͻ���
		TrackerClient trackerClient = new TrackerClient();
		//ͨ��trackerClient��ȡһ������connection
		TrackerServer trackerServer = trackerClient.getConnection();
		//����һ��StorageServer 
		StorageServer storageServer = null;
		
		//��trackerServer��storageServers ����һ��
		StorageClient storageClient = new StorageClient(trackerServer,storageServer);
		//�ɣ�storageClient��ʼ�ϴ�����
		String[] strings = storageClient.upload_file("D:/1.png","png",null);
		//�洢���֮�󷵻ص�ֵ
		for (String string : strings) {
			
			System.out.println(string);
			}
	}
}
