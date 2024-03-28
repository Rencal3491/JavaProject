package javaEx_B;
import java.util.Scanner;

public class B06_while_Example {

	public static void main(String[] args) {
		// While문
		// for문 보다 자유도가 높음
		// for문과 달리 조건이 참인지 여부만 확인
		
		// while(조건) {
		//	조건이 참일때에 실행할 명령문
		//	}
		int i=0;
		while (i<10) {
			//i++; 증가값	위치에 따라 결과가 다르게 나타날 수 있다.
			System.out.println(i);
			i++;
			
		}
//		// while의 무한루프
//		while (true) {
//			System.out.println(i += 10000);
//			if( i%20000==0)
//				continue;
//			if(i<0)		//반복 종료 시점
//				break;
//		}
		// do-while 
		// 반복할때 한번 이상 실행해야 할 때
//		int i = 0;
//		Scanner sc = new Scanner(System.in);
//		while((i = sc.nextInt()) != 0) {
//			System.out.println("i가 0이 아닙니다");
//		}
//		sc.close();
//		do {
//			System.out.println("> ");
//			i = sc.nextInt();
//			System.out.println("i가 0이어도 일단 한번은 실행");
//			
//		}while(i!=0);
//		sc.close();
//		
	}
}
