import java.util.Scanner;

public class C02_method2 {

	public static void main(String[] args) {
		//메소드 정리
		//메소드의 반환 설정은 키워드 'return' 을 사용
		// return은 메소드 실행을 끝나고, 결과값을 호출될 부분에 반환하는 키워드
		// 사용법은 return '반환값' 으로 사용하고, 
		// 반환 값이 없이 사용되는 return은 함수의 종료를 의미하며, 호출된 위치로 이동하게 함
		// 만약 return에 연산식을 사용하여 처리하는 그 결과 값과 제어(호출위치로 이동)가 함께 동작함
		
		/*
		 *  메소드 형식 (선언 방법)
		 *  <반환 유형> < 메소드 식별자 - 이름 > (매개변수) {
		 *  	기능 상세부분
		 *  }
		 *  메소드 구분 - 매개변수와 반환값으로 구분
		 *  1. 매개변수가 있고, 반환값이 있는 경우 - 전달 인자o 반환값o
		 *  2. 매개변수가 있고, 반환값이 없는 경우 - 전달 인자o 반환값x
		 *  3. 매개변수가 없고, 반환값이 있는 경우 - 전달 인자x 반환값o
		 *  3. 매개변수가 없고, 반환값이 없는 경우 - 전달 인자x 반환값x
		 *  
		 *  **매개변수 (parameter)
		 *  - 매개변수는 메소드가 실행될 때에 피룡한 데이터를 외부로부터 받기 위해서 사용함
		 *  - 매개변수도 변수의 일종으로 데이터 타입과 함꼐 선언해서 사용해야 함. 단, 초기화는 하지 않는다
		 *  - 매개변수를 여러개 선언할 수 있고, 메소드가 외부로부터 받을 데이터가 없다면 선언하지 않아도 됨
		 *    그리고 매개변수가 없다면 반환유형처럼 void는 사용하지 않음 () 소괄호 안을 비운다
		 *    
		 *  **반환 유형 (return type)
		 *  - 메소드가 실행한 후에 메소드를 호출한 곳에서 반환값을 전달하는 데이터
		 *  - 메소드는 반환값이 있을 수도 있고 없을 수도 있지만, 없는 경우에는 반환 유형에 void를 사용
		 *  - 반환값이 있는 메소드를 호출할 때는 해당 반환 유형에 맞는 변수에 반환값을 저장해야 함
		 *  - 메소드 실행에 결과값을 반환할 때는 return 키워드를 사용해야 함
		 *  
		 */
//	print();
//	int num1=input();
//	int num2=input();
//	int res =add(num1,num2);
//	showRes(res);
//		
//	}
//	
//		//유형 1
//	static int add(int num1, int num2) {
//		int res = num1+num2;
//		return res;
//	}
//		//유형 2
//	static void showRes(int res) {
//		System.out.println("결과 : " + res);
//		
//	}
//		//유형 3
//	static int input() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 입력 >>");
//		int num = sc.nextInt();
//		return 0;
//	}
//		//유형 4
//	static void print() {
//		System.out.println("정수 두개 입력하세요 >>");
//	}
//	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
