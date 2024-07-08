import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex02 {
  public static void main(String[] args) {
    try {
      InetAddress ip = InetAddress.getByName("www.google.co.kr");
      System.out.println("hostname : " + ip.getHostName());
      System.out.println("IP Address : " + ip.getHostAddress());
      
      InetAddress[] ips = InetAddress.getAllByName("www.google.co.kr");
      for(InetAddress IP : ips) {
        System.out.println("IP Address : " + IP);
      }
      System.out.println();
      
      byte[] ipAddr = ip.getAddress();
      for(byte b : ipAddr) {
        System.out.print((b < 0 ? b + 256 : b) + ".");
      }
      System.out.println();
      
      for(int i = 0; i < ipAddr.length; i++) {
        if(i == ipAddr.length - 1) {
          System.out.print((ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr));
        } else {
          System.out.print((ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr));
        }
      }
      System.out.println();
      
      InetAddress local = InetAddress.getLocalHost();
      System.out.println("내 컴퓨터 IP : " + local);
      
      InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
      System.out.println(ips[0].getAddress() + " 주소 : " + ip2);
      
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
