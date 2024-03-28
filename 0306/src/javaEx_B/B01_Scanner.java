package javaEx_B;
import java.util.*;
//import는 외부의 클래스를 이 파일에 가져와 사용한다는 의미
// ctrl + shift + o : Eclipce 내의 자동 import 단축키

public class B01_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 클래스는 데이터타입
		// Scanner는 사용자의 입력을 기다리고
		// 입력한 물자열을 한줄 읽어들임
		System.out.print(">> ");
		String line = sc.nextLine();	//참조형 타입의 변수에 "."을 찍은 후에 해당 참조형을 참조
		System.out.println("사용자가 입력한 문자열 : " + line);
		
		// 참조형 타입 변수에 .을 찍고, ctrl + space로 그 타입에 사용할 수 있는 기능들을 볼 수 있음
//		System.out.println("has next boolean : ");
//		boolean b = sc.hasNextBoolean();
//		System.out.println("boolean 포함 여부 : " + b);
		
		//사용자 입력값을 기다리면서 정수값을 처리하는 방식
		System.out.println("아무 정수 값이나 입력해 보세요 >> ");
		int num = sc.nextInt();
		System.out.println("사용자가 입력한 정수 : " + num);
		System.out.println("사용자가 입력한	char : " + (char)num);
		
	}

}
