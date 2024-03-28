package javaEx_B;

public class B08_variableLifeTime {
	static int c; //클래스 멤버변수			-클래스에 직접 사용하는 변수로, 객체 생성과 상관x
	int b = 8; //인스턴 멤버변수(필드,속성)	-객체가 생성되어야 쓸 수 있음
	
	
	public static void main(String[] args) {
	// 변수의 수명
	// 블럭 {} 내부에서 선언된 변수는 지역변수로 {}을 벗어나면 사라진다
	// 변수가 살아 있는 범위를 변수의 영역(scope)라고 부름
	// 변수의 영역이 겹치지 않으면 같은 이름의 변수 사용가능
	int b =5;	//지역 변수
	System.out.println("main method의 b: " + b);
	c =10;
	System.out.println("Class 멤버변수 c: " + c);
	
	//객체생성
	B08_variableLifeTime obj = new B08_variableLifeTime();
	System.out.println("class의 b(인스턴스 멤버변수) " + obj.b);
	System.out.println();
	B08_variableLifeTime obj2 = new B08_variableLifeTime();
	obj.b= 100; //obj2 객체의 b인스턴스 변수값을 수정
	System.out.println("class의 b(obj 인스턴스 멤버변수): " + obj.b);
	System.out.println("class의 b(obj2 인스턴스 멤버변수) " + obj2.b);	
	
	//클래스 변수
	System.out.println("대입 전" + obj.c);
	obj.c = 20;
	System.out.println("대입 후" + obj.c);
	System.out.println("대입 후" + obj2.c);
	B08_variableLifeTime.c = 200;
	System.out.println("대입 후" + obj.c);
	System.out.println("대입 후" + obj2.c);
	
	if(true) {
		int a = 10; //지역변수
		System.out.println(a); 
		a=7;
		System.out.println("메인 메소드의 b : " + b);
		
	}
//	a=7; 블럭 밖이라 찾을 수 없으므로 에러발생
	if(true) {
		int a=20;
		System.out.println(a);
		}
	for (int i = 0; i<10; i++) {
		//for 문에서 사용되는 int i(초기값) {} 내에서 선언된 지역변수
		//int i의 값은 for문을 벗어 날 수 없음
		
	}
	
	}
	
}
