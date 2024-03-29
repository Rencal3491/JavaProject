package javaEx_A;

public class A03_Variable {

	public static void main(String[] args) {
		// 변수(variable) 
		// 데이터를 담아서 보관 할 수 있는 공간을 의미
		// 자바에서 변수는 선언한 뒤에 사용
		// 변수,메소드,클래스의 이름 : 식별자
		// 대문자 소문제 구분하며, 길이 제한이 없음. ex)Run RUN run 
		// 문자와 숫자, 밑줄_, 달러기호$ 포함가능
		// 문자와 숫자, 밑줄_, 달러기호$로 시작가능, 숫자로 시작할 수 없음
		// (문자는 영문자 사용을 추천)
		// _ $는 로컬 시스템에서 규칙이 있는 경우가 있기 때문에 부득이한 경우 아니면 사용 X
		// 식별자에는 공백을 포함 할 수 없음 ex) a 1 (X) a1(O) a_1(O)
		// 키워드는 식별자로 사용하면 안됨
		// 키워드는 시스템 또는 자바에서 기본적으로 사용하는 명령어나 변수를 의미
		/*
		 * 
		 */
		// 이름 규칙
		// 클래스 이름,인터페이스 이름 
		// > 명사나 형용사를 서술적으로 연결해서 사용
		// > 첫 글자는 대문자로 표기
		// > 연결된 단어의 첫 글자는 대문자로 표기
		// > 나머지는 소문자로 표기
		// > &는 내부 클래스에서 특별한 의미를 가지고 있기 때문에 사용을 권장하지 않음.
		// ex) CustomerManeger
		
		// 변수 이름
		// > 명사적 의미를 가지도록 만들어 준다
		// > 첫글자는 소문자로, 연결되는 단어의 첫 글자는 대문자로 표기
		// > 나머지는 소문자로 표기
		// > 일반적으로 변수 이름에는 _ 를 사용하지 않음
		// ex) customerName
		
		// 메소드 이름 
		// > 동사적 의미를 가지도록 만들어 준다
		// > 첫글자는 소문자로, 연결되는 단어의 첫 글자는 대문자로 표기
		// > 나머지는 소문자로 표기
		// > 메소드 이름 뒤에는 한 쌍의 "( )" 괄호가 따라 붙는다
		// > 일반적으로 변수 이름에는 _ 를 사용하지 않음
		// ex) insertCustomerData()
		
		int a = 10; //변수의 선언 : 데이터타입  변수명 = 초기화 값;
		String str = "Hello, world!"; //String 타입 "Hello, world!" 값을 가지는 str 선언
		
		System.out.println(a);
		System.out.println(str);
		
		
//		int a = 20; 	// 같은 이름의 변수는 밑에서 다시 선언 불가
		a = 20; 		// 재사용은 가능함
		// ** int 는 정수 타입을 나타내는 키워드
		
		// 변수를 사용하는 이유
		// 1. 값을 일괄적으로 변경할 수 있게 하기 위해 (같은 값을 여러번 사용해야 하는 경우)
		int k = 11;
		System.out.println("철수의 나이는 " + k + "살 입니다");
		System.out.println("철수의 무게도 " + k + "kg 입니다");
		System.out.println("철수의 친구도 " + k + "명이 있습니다");
		
		// 2. 값에 의미를 부여 할 수 있다 (작명규칙이 중요한 이유)
		int height = 185;
		int subject = 5;
		int old = 25;
		int weight = 100;
		
		System.out.println("키 : " + height);
		
		System.out.println("과목 : " + subject);
		System.out.println("나이 : " + old);	
		System.out.println("무게 : " + weight);	
	}

}
