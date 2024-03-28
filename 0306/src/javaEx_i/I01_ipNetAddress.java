package javaEx_i;

import java.net.InetAddress;

public class I01_ipNetAddress {
	//주소 관련 클래스 InetAdress
	public static void main(String[] args) {
		
		try {
			//getByName 메소드를 통한 InetAdress 객체 생성
			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("HostName = "+ ip.getHostName());
			System.out.println("ip = " + ip.getHostAddress());
			//getAllByName 을 통한 방법
			InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : ips) {
				System.out.println("ip주소 : " + i);
				
			//ip주소값을 byte[] 배열로 리턴
			byte[] ipAddr = ip.getAddress();
			//byte 표현범위  -128~127
			for (byte b : ipAddr) {
				System.out.print(((b<0)?b+256:b)+".");
			}
			System.out.println();
			//getLocalHost이용하여 호출
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 ip : " + local);
			//getByAddress이용하여 호출
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress() + "주소 : "+ ip2);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
