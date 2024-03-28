package javaEx_D;
import java.io.IOException;

public class D07_checkedExceptionEx {

	public static void main(String[] args) {
		//checkedException은 예외처리해야 함, 잘못된 값이 들어와서 예외발생 가능
		System.out.println("값을 입력받는 프로그램 입니다");
		byte[] data	= new byte[100]; //한번에 100바이트 처리할 공간
		try {
			System.in.read(data);	//입출력 관련은 체크해야함
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력할 문자열은 : ");
		System.out.println(new String(data).trim());
	}

}
