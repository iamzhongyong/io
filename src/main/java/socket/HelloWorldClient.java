package socket;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

public class HelloWorldClient {
	public static void main(String[] args) throws Exception{
		// ��ʾ���ӵ��������˿�
		Socket client = new Socket("localhost", 9999);
				
		//������ݵ������
		PrintStream out = new PrintStream(client.getOutputStream());
		
		out.append(String.valueOf("���ǿͻ���"));
		out.append(String.valueOf("����Ҫ���͵���Ϣ�ǣ�"));
		out.append("��ǰ����=" + new Date());
		out.println();
		
		client.close();
	}

}
