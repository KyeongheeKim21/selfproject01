package ThisIsJavaNetworking;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("my com ip add: "+local);
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote: iaArr) {
				System.out.println("www.naver.com IP address: "+ remote.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
