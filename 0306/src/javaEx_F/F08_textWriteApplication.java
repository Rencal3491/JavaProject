package javaEx_F;

import java.io.FileOutputStream;

public class F08_textWriteApplication {

	public static void main(String[] args) {
		String data1 ="홍길동, M, ASDF@naver.com";
		String data2 ="조민준, M, qwer@naver.com";
		FileOutputStream fos =null;
		try {
			fos = new FileOutputStream("customer.txt");
			fos.write(data1.getBytes());
			fos.write('\n');
			fos.write(data2.getBytes());
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fos != null) try {
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
