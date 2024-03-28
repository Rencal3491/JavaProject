package javaEx_A;

public class A06_operator {

	public static void main(String[] args) {
		//연산자
		int a = 7, b=3;	
		//산술연산자
		System.out.println("*** 산술 연산자 ***");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); 		// 나누기는 같은 타입인 경우 해당 타입으로 출력됨
		System.out.println(a / 3.0); 	// 실수 타입과 정수가 연산하면, 실수 타입으로 출력
		System.out.println(a % b);		// 나머지 연산(mod) 
//		System.out.println(a ^ b);		// 비트연산자
		System.out.println((int)Math.pow(a, b)); //제곱
		System.out.println();
		
		//비교연산자 (비교 연산자의 결과는 boolean 타입)
		System.out.println("*** 비교 연산자 ***");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b); 	//같다 (같을경우 true 리턴)
		System.out.println(a != b); 	//같지않다 (같지 않을 경우 true 리턴)
		
		//논리연산자
		// && : 둘 모두 true 일 때 true 리턴 (두 조건 모두 만족해야 true) <- 논리곱
		// || : 둘 중 하나만 true 면 true 리턴 (둘 중 하나 만족해야 true) <- 논리합
		System.out.println("*** 논리 연산자 ***");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("결과 : " + (a > b && a/b == 2));
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//대입연산자
		System.out.println("*** 대입 연산자 ***");
		a = 10;
		System.out.println(a);
		
		//복합대입연산자
		System.out.println("*** 복합대입 연산자 ***");
		a += 2; 	// a = a + 2
		System.out.println(a); //12
		a -= 5;		// a = a - 5
		System.out.println(a); //7
		a *= 10;	//a = a * 10
		System.out.println(a); //70
		a /= 7; 	//a = a / 7
		System.out.println(a); //10
		a %= 3;		//a = a % 3
		System.out.println(a); //1
		
		System.out.println("*** 삼항 연산자 ***");
		//삼항연산자
		//비교 ? 참:거짓
		a = 7;
		b = 4;
		
		System.out.println("*** 단항 연산자 ***");
		//단항연산자
		String answer = a>b ? "a가 큽니다" : "b가 큽니다";
		System.out.println(answer);
		
		int value = a> b ? 10:5;
		System.out.println(value);
		
		System.out.println("*** 대입 연산자 ***");
		
		
		a = 10;
		System.out.println("*** 단항 연산자 ***");
		a++; 	//a의 값을 1 증가시킨다 (후치 - 처리한 후 증가)
		System.out.println(a);
		++a; 	//a의 값을 1 증가시킨다	(전치 - 처리 전 증가)
		System.out.println(a);
		a--;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		a = 7;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println();
		
		// ! : boolean 타입에서만 사용
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(a > b);
		System.out.println(!(a > b));
		
		// ~ : 비트 반전 -> 2진수 0을 1로 1을 0으로 반전
		System.out.println(10);	
		System.out.println(~10);
		// 0| 000 0000 0000 0000 0000 0000 1010 => 10
		// 1| 111 1111 1111 1111 1111 1111 0101 => -11
		// S| => signed bit(0이면 양수 , 1이면 음수)


		System.out.println("*** 비트 연산자 ***");
		//비트연산자
		//이진법으로 계산하는 연산
		// & , |, >>, <<, ^
		
		a = 7; // 0000 0111
		b = 3; // 0000 0011
		
		System.out.println(a & b);
		//		0000 0111
		//		0000 0011
		// 		=========
		//  	0000 0011 = 3
		System.out.println(a | b);
		//		0000 0111
		//		0000 0011
		// 		=========
		//		0000 0111 = 7
		System.out.println(a ^ b); // 배타적 논리비교 (다른것만 true)
		//		0000 0111
		//		0000 0011
		// 		=========
		//		0000 0100 = 4
		System.out.println(a << b);
		//		0000 0111
		//		<< 3
		// 		=========	
		//		0011 1000 = 56
		System.out.println(a >> b);
		//		0000 0111	
		//		>> 3
		//		=========
		//		0000 0000 (111)
	}

}
