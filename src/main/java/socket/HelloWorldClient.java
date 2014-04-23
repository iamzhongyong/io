package socket;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

public class HelloWorldClient {
	public static void main(String[] args) throws Exception{
		// 表示连接的主机及端口
		Socket client = new Socket("localhost", 9999);
				
		//输出内容到服务端
		PrintStream out = new PrintStream(client.getOutputStream());
		
		out.append(String.valueOf("我是客户端"));
		out.append(String.valueOf("，我要发送的消息是："));
		out.append("当前日期=" + new Date());
		out.println();
		
		client.close();
	}

}
