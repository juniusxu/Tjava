package javademo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Chapt19 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		InetAddress locAdd=null;
		locAdd=InetAddress.getLocalHost();
		System.out.print(locAdd.getHostAddress());
		
		
		System.out.print(locAdd.isReachable(1000));
	}

}
