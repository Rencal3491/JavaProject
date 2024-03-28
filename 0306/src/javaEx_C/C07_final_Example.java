/*
 * Uage Modifier final
 * - 일반적으로 final은 그 값이 변하지 않음을 의미
 * - 변수에 final이 붙으면 그 값은 변경할 수 없음, 때문에 static과 같이 사용시 상수로 사용
 * - 메소드에 final이 붙으면 그 메소드는 재정의할 수 없음. 재정의 할 필요가 없는 메소드일때
 * 	개발자가 재정의를 허용하지 않게 하기위해 사용
 * - 클래스에 final이 붙으면 그 클래스는 자식 클래스를 가질 수 없음

 */
package javaEx_C;

class MyDate {
	int year = 2024;
	int month =3;
	int day = 15;
	public String toString() {
		return "[" +year + "-" + month + "-" + day + "]";
		
	}
	public void doit(final int a) {
//		a++; //The final local variable a cannot be assigned.
	}
}
class Parent { //The type Child cannot subclass the final class Parent
	public final void method() {
		System.out.println("부모 메소드 ()");
	}
}
class Child extends Parent {
	//  부모가 final로 정의한 메소드는 오버라이드 불가..
	//	public void method() { Cannot override the final method from Parent
		
	
}
class FinalInit {
	final int a;
	//인스턴스 초기화자
//	final int a=10; 1) 선언과 동시에 초기화
	
//	{ 	
//		a=10;	 	2) 인스턴스 초기화자를 사용
//	}
//	FinalInit() {
//		a =10;		//3) 생성자를 이용
//	}
	FinalInit(int a) {
		this.a =10;		//4) 생성자를 이용한 방법이 아님
	}
}

public class C07_final_Example {

	static final MyDate date = new MyDate();
	
	public int data = 100;
	
	
	public static void main(String[] args) {
// 		date = new MyDate(); // date 먄스러 새로운 객체 생성 불가
	System.out.println(date.toString());	
	date.year = 2025;
	System.out.println(date.toString());
	
	new C07_final_Example().doit("홍길동");
	System.out.println(new FinalInit(100).a);
	
	}
	
	
	public void doit(final String name) {
		final int age = 38;	 //내부 클래스에 전달되는 지역변수는 꼭 final을 붙임
		class InnerLocal {   //내부 클래스
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data : " + data);
				System.out.println("외부 클래스의 파라미터 변수 name : " + name);
				System.out.println("외부 클래스의 지역변수 age : " + age);
				
				
			}
		}
		new InnerLocal().innerDoIt();
	}
}
