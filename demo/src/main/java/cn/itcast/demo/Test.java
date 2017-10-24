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
		
		
		//加载fastFDFSD的配置文件 一定要是实际路径
		ClientGlobal.init("F:\\Project\\pinyougou\\demo\\src\\main\\resources\\fdfs_client.conf ");
		
		//新建一个TrackerClient 客户端
		TrackerClient trackerClient = new TrackerClient();
		//通过trackerClient获取一个连接connection
		TrackerServer trackerServer = trackerClient.getConnection();
		//定义一个StorageServer 
		StorageServer storageServer = null;
		
		//由trackerServer和storageServers 创建一个
		StorageClient storageClient = new StorageClient(trackerServer,storageServer);
		//由；storageClient开始上传数据
		String[] strings = storageClient.upload_file("D:/1.png","png",null);
		//存储完成之后返回的值
		for (String string : strings) {
			
			System.out.println(string);
			}
	}
}
