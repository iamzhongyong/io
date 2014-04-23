package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class HelloWorldServiceServerThread implements Runnable {

	//客户端的链接
	private Socket client;
		
	public HelloWorldServiceServerThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
			//获得客户端的输入，即客户端传递到服务端的信息
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			System.out.println(Thread.currentThread().getName() + ",启动服务端的线程处理这个信息");
			
			//获得客户端的输入
			System.out.println("客户端传递给我的信息是："+reader.readLine());
						
			client.close();
			System.out.println(Thread.currentThread().getName() + ",线程退出");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
