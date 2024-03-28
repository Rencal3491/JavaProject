package javaEx_F;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class F10_dataWrite {

	public static void main(String[] args) {
		//단순 텍스트 방식과 달리,  필드 구분자 레코드 구분이 추가되지 않아도 된다
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("customer.data");
			dos = new DataOutputStream(fos);
			dos.writeUTF("홍길동"); dos.writeChar('M');
			dos.writeUTF("hong@naver.com"); dos.writeInt(1589);
			dos.writeUTF("조민준"); dos.writeChar('F');
			dos.writeUTF("jooo@naver.com"); dos.writeInt(1990);
			System.out.println("file saved");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(dos!=null) dos.close(); 
			} catch (Exception e2) {
				
			}
		}
	}

}
