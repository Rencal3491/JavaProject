package javaEx_F;

import java.io.File;
import java.io.FileWriter;

public class F04_fileWriterEx {

	public static void main(String[] args) {
		File file = new File("C:/FileTest/test.txt");
		FileWriter out =null;
		try {
			//FileWriter 객체 생성
			out = new FileWriter(file,true); //append 가 false이면 추가 x true 면 추가 o
			out.write("바보바보바보\n");
			out.write(" 진짜진짜바보바보바보\n");
			out.append("테스트용 메시지\n");
			out.append("test message\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
