package javaEx_F;

import java.io.File;
import java.io.FileReader;

public class F03_fileReaderEx {

	public static void main(String[] args) {
		File file= new File("C:/FileTest/test.txt");
		FileReader in = null;
		char[] cbuf = new char[100];
		
		try {
			in=new FileReader(file);
			String content = "";
			while(true) {
//				int data = in.read(); // 한글자 값을 반환
//				System.out.printf("%X",data);
				
//				System.out.print((char)data);
//				if(data == 1) {
//					break;
//				}
				int data =in.read(cbuf);		//data 반환값은 char의 갯수, 글자수를 기준으로 함
				System.out.println(data);
				if(data != -1)content= new String(cbuf,0,data); 
				else break;
				System.out.println(content);
			}
		} catch (Exception e) {
			
		}finally {
			try {
				in.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
