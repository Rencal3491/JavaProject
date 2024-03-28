package javaEx_B;
import java.util.Scanner;

public class B04_forInfinity {

	public static void main(String[] args) {
		// for 의 무한루프
//		for (int i=0; true; i++) { //조건 부분이 항상 참이 되는 경우
//			System.out.println(i);
//		}
//		for(;;) {
//			System.out.println('a');
//		}
		//break문 
		//반복문에서  break를 만나면 반복문을 종료 - 탈출
		//다중 반복문 내부에 속해 있더라도 break를 만나면 해당 break가 속한 반복문 하나는 탈출
//		for(int i=0; true; i++) {
//			System.out.println(i);
//			for(int j=0; true; j++) {
//				System.out.println("j반복");
//				if(j==58) {
//					break;
//				}
//			}
//		}
		//무한 반복 활용 예제
		String answer = "자동차";
	Scanner sc = new Scanner(System.in);
//		for(;;) {
//			System.out.print("> ");
//			String att = sc.nextLine();
//			if(ans.equals(att)); {  //문자열 비교는 equals() 메소드를 사용
//				System.out.println("정답");
//				break;
//			}
//		}
		String attempt = "";
		for(;!attempt.contentEquals(answer);) {
			System.out.print("> ");
			attempt = sc.nextLine();			
		}
		System.out.println("정답");
		sc.close();
	}

}
