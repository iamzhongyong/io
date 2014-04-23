package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class HelloWorldServiceServerThread implements Runnable {

	//�ͻ��˵�����
	private Socket client;
		
	public HelloWorldServiceServerThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
			//��ÿͻ��˵����룬���ͻ��˴��ݵ�����˵���Ϣ
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			System.out.println(Thread.currentThread().getName() + ",��������˵��̴߳��������Ϣ");
			
			//��ÿͻ��˵�����
			System.out.println("�ͻ��˴��ݸ��ҵ���Ϣ�ǣ�"+reader.readLine());
						
			client.close();
			System.out.println(Thread.currentThread().getName() + ",�߳��˳�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
