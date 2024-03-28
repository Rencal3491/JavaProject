package javaEx_D;
import java.io.FileInputStream;
import java.io.IOException;

import javax.print.DocFlavor.INPUT_STREAM;

public class D08_autoResourceManegerEx {
	
	public static void main(String[] args) {
		//파일 입출력
		try (FileInputStream in = new FileInputStream("D:\\MJ\\AWSDEVELOP\\0306\\src\\a.txt")) {
			System.out.println("read data : " + in.read());
		} catch (NullPointerException | IOException ex) {
//			System.out.println(in); //in변수 참조 안됨
			System.out.println("예외 처리합니다");
			System.out.println(ex.toString());
		  }
	// 직접 자원에 대해서 제어
	FileInputStream in2 = null;
	try {
		in2 = new FileInputStream("D:\\MJ\\AWSDEVELOP\\0306\\src\\a.txt");
		System.out.println("read data : " + in2.read());
	} catch (NullPointerException ex) {
		System.out.println("예외 처리합니다");
		System.out.println(ex.toString());
	} catch (IOException ie) {
		System.out.println(in2);
		System.out.println(ie.toString());
	} finally {
		try {in2.close();} catch (IOException ie) {}
	}
	}
}
