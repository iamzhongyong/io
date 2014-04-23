package socket;

import java.net.ServerSocket;
public class HelloWorldServer {

	public static void main(String[] args)  throws Exception{
		//启动一个socket的服务器
		ServerSocket ss = new ServerSocket(9999);
		
		//循环接收客户端的连接，每个连接启动一个线程处理
		System.out.println("我是服务器端，等待客户端来连接我啊。。。");

		while(true){
			new Thread(new HelloWorldServiceServerThread(ss.accept())).start();
		}
	}
}
