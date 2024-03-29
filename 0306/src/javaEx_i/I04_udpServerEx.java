package javaEx_i;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class I04_udpServerEx {

	public static void main(String[] args) {
		//UDP서버
		try {
			//DatagramSocket 객체 생성
			DatagramSocket socket = new DatagramSocket(9500);
			DatagramPacket inPacket;
			byte[] inMsg = null;
			while(true) {
				//데이터를 받기위한 바이트배열 생성
				inMsg = new byte[1024];
				//DatagramPacket 객체 생성
				inPacket = new DatagramPacket(inMsg, inMsg.length);
				//패킷 데이터 수신
				socket.receive(inPacket);
				String msg =  new String(inMsg,0,inPacket.getLength());
				//클라이언트 IP
				InetAddress address = inPacket.getAddress();
				int port = inPacket.getPort();
				System.out.println("클라이언트 주소 : " + address);
				System.out.println("클라이언트 포트 : " + port);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
