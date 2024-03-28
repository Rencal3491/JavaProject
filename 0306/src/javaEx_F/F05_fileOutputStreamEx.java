package javaEx_F;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class F05_fileOutputStreamEx {

	public static void main(String[] args) {
		// 문자열을 입력 받아서 해당 문자열을 파일로 내보내기
		//입력 
		Scanner sc =  new Scanner(System.in);
		System.out.println("파일 명을 입력하시오 >> ");
		String name = sc.next();
		//빈 객체 선언
		OutputStream fos = null;
		try {
			//fileOutputStream 생성
			fos =new FileOutputStream("C:/FileTest/" + name +".txt");
			System.out.println("문장 입력 >>");
			sc.nextLine(); //버퍼 정리
			String str = sc.nextLine();
			byte[]bs = str.getBytes();
			fos.write(bs); //OutputStream의 주 메서드
			System.out.println("파일이 정상적으로 저장됨");
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		}

	}


