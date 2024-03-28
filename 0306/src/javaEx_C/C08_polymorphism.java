/*
 * 다형성
 * -여러가지 형태를 가지는 성질
 * -다형성은 상속을 전제조건으로 함
 * -동일한 메시지더라도 어떤 객체에 전달되느냐에 따라 다양한 동작 가능
 * -프로그램에 유연성 부여
 * -다형성은 존재하지 않았던 클래스를 기존 시스템에 수정없이 시스템에 추가하도록 함
 * (다형성 인자 예제)
 * 다형성을 적용하는 방법은 부모클래스의 객체선언 - 자식클래스 객체 할당 (반대는 불가)
 * 다형적 객체의 경우 부모클래스에 있는 메소드만 사용가능함
 * - 자식클래스에 재정의되어 있다면 실행은 자식클래스에 있는 메소드로 실행됨
 * - 자식클래스의 메소드가 실행되더라도 부모클래스에 있는 해당 메소드를 지우면 안됨
 * - 이유는 컴파일시 부모의 메소드를, 실행시에는 자식의 메소드를 사용하기 때문
 * 선언시 자료형은 반드시 구현된 클래스일 필요는 없다 ,  추상클래스나 인터페이스도 가능
 * 이런 특성을 이용해 개발자는 인터페이스를 통해 명세를 제공할 수 있음
 */
package javaEx_C;

import obj.inheritance.person;
import obj.inheritance.goodcase.*;


public class C08_polymorphism {

	public static void main(String[] args) {
		//다형성 테스트
		person p = new Student("홍길동", 17,"20240315","도술");
		System.out.println(p);
		//오버라이드 된 메소드의 실행
		person po = new person("이순신",40);
		System.out.println(po.getDetails());
		p.walk();
//		p.study(); p는 다형적 객체이기 때문에 부모 클래스에 있는 메소드만 사용
		//Student 로 캐스팅 되어야 사용가능
		Student casting =  (Student)p;
		casting.study();
		po.walk();
		
		person p2;
		p2 = new Employee("홍사원",25,"교무처");
		// instanceof = 좌항의 객체와 우항의 클래스를 비교
		System.out.println(p2 instanceof person);
		System.out.println(p2 instanceof Employee);
		System.out.println(p2.getDetails());
		
	}
	

}
