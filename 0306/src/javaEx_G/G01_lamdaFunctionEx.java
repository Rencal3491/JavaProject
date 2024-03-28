package javaEx_G;

public class G01_lamdaFunctionEx {
	//람다식 (간결한 코드 사용)
	//고전적인 방식인 객체지향적인 프로그램 방식이 아닌 함수적 프로그래밍을 위한 기법에 사용
	//람다는 익명함수를 위한 방식, 람다는 기존방식보다 자바코드를 간결하게 표현할 수 있다
	//다만, 처음에는 익숙하지 않아 혼란스러울 수 있다.
	
	//람다식은 함수적 인터페이스를 자료형으로 사용.
	//-함수적 인터페이스 : 추상 메소드가 한개만 존재하는 인터페이스
	
	//람다식의 표현 
	//(타입매개변수) - > {실행문}
	//매개변수가 없는 경우 () -> {} 식으로 표현
	//매개변수가 하나인경우 ()생략가능 
	
	//인터페이스 변수  =  람다식;
	
	public static void main(String[] args) {
		// 첫번째 람다
	InterFaceEx ie = (int x, int y) -> x+y;
	System.out.println(ie.sum(10,20));
	// 함수적 인터페이스
	LamdaInterface li = () -> {
		String st = "메서드 출력";
		System.out.println(st);
	};
	li.print();
	
	}
interface InterFaceEx {
	public int sum(int x, int y);
	
}
@FunctionalInterface	//해당 인터페이스가 함수적 인터페이스 임을 알림
interface LamdaInterface {
	void print();
//	void print(); 메소드가 두개라서 오류 발생
}
}
