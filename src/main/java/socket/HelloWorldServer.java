package socket;

import java.net.ServerSocket;
public class HelloWorldServer {

	public static void main(String[] args)  throws Exception{
		//����һ��socket�ķ�����
		ServerSocket ss = new ServerSocket(9999);
		
		//ѭ�����տͻ��˵����ӣ�ÿ����������һ���̴߳���
		System.out.println("���Ƿ������ˣ��ȴ��ͻ����������Ұ�������");

		while(true){
			new Thread(new HelloWorldServiceServerThread(ss.accept())).start();
		}
	}
}
