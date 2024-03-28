package javaEx_B;
import java.util.Scanner;

public class B03_switchExample2 {

	public static void main(String[] args) {
		// switch case 문을 이용하여 특정 문자를 입력받는 경우 내용 출력
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		System.out.println(str.charAt(0)); 
		// charAt()는 인자 int에 들어가는 값의 위치에 있는 문자열을 리턴 0 ~ ...
		switch (str.charAt(0)) {
		case 'i': 
			System.out.println("데이터를 입력합니다. ");
			break;
		case 'ㅑ': 
		case 'ㅕ': 
		case 'U': 
		case 'u': 
			System.out.println("데이터를 수정합니다. ");
			break;
			
		default:
			System.out.println("올바르지 않은 데이터. ");
			break;
		}
		
		
	}

}
