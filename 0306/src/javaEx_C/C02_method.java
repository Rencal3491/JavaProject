package javaEx_C;

public class C02_method {
	// 메소드(method) 
	// 클래스의 행동 및 기능을 나타냄, 다른 언어에서는 함수라고도 불리지만
	// 자바에서는 클래스 내무에만 정의할 수 있기 때문에 메소드라는 용어를 사용함
	
	// 메소드 특징
	// - 어떤 단어 뒤에 () 가 붙는 경우 메소드이다
	// - 한번 만들어두면 여러번 사용할 수 있음 - 코드의 재사용
	// - 여러 기능들을 묶어서 이름을 붙여 놓은 것이 메소드
	// - 값을 반환할 수 있다
	
	// 메소드의 형식 ()안의 내용은 생략 가능
	// - (접근 제한자) (static) 반환 타입 메소드명(매개변수 타입,매개변수 이름) {
	// 		여러가지 기능 구현
	//	}
	// 반환타입 : 메소드가 모든 기능을 실행한 후에 전달할 반환 값의 타입을 지정
	// 			반환할 떄 사용하는 키워드는 return을 사용 ex) return 10(반환할 값);
	// - 반환 타입 종류 : int, String , char, float, double, boolean, void
	// void 타입을 지정한 경우 함수의 반환겂이 없음, 즉 return으로 전달할 값이 없다는 의미
	// 메소드명 : 메소드를 호출할 때 사용할 이름
	// 매개변수 : 함수를 호출하면서 () 안에 전달해주는 값
	// 매개변수 타입 : 매개변수의 타입을 지정
	
	static int getInteger() {
		final int seed = 5;
		int res = 1;
		for (int i=1; i<seed; i++) {
			res = seed * res;
		}
		return res;
	}
	
	static void createRabbit() {
		System.out.println("====================");
		System.out.println();
		System.out.println("       /)/)");
		System.out.println("      (  ..)");
		System.out.println("      (   >♡");
		System.out.println();
		System.out.println("  Have a Good Time");
		System.out.println();
		System.out.println("====================");
	}
	static String makeBanner(String msg) {
		return "****" + msg + "****";
	}
	public static void main(String[] args) {
		//메소드 정보 확인 : 메소드를 가리키고 F2를 누르면 메소드 정보를 볼 수 있음
		//메소드 메소드 정의됨 곳으로 이동 : 메소드를 가리키고 F3을 누르면 정의한 곳으로 이동
		
		//호출하면 콘솔에 토끼가 나오는 메소드
		for(int i=0; i<10; i++) {
			createRabbit();
			
		// 문자열을 넣으면 *를 붙여서 반환하는 메소드
		String result = makeBanner("알 림");
		System.out.println(result);
		
		// 정수형 값을 받는 메소드
		System.out.println(getInteger());
		
		}
	}
	
	
}
