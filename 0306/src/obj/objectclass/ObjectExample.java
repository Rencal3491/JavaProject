package obj.objectclass;

import obj.inheritance.person;

public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object(); //최상위객체
		obj.hashCode(); 		   //객체 동등비교
		obj.equals(obj);		   //객체 동등 비교를 위해서 재정의해서 사용
		obj.toString();			   //기본적으로 클래스명@hashcode 값으로 출력
								   //재정의해서 객체 내의 정보를 확인하는 용도로 사용됨
		
		person p1 = new person(20,"홍길동");
		person p2 = new person("홍길동", 20, 185.0f, 0);
		System.out.println("p1의 해시값 " + p1.hashCode());
		System.out.println("p2의 해시값 " + p2.hashCode());
		System.out.println("p1과 p2 비교 " + (p1.hashCode() == p2.hashCode()));
		System.out.println("p1의 클래스명과 해시코드" + p1.toString());
		
		person o1 = new person("홍길동",20);
		person o2o1 = o1;
		person o2 = new person("홍길동",20);
		System.out.println("o1의 해쉬값 : " + o1.hashCode());
		System.out.println("o2의 해쉬값 : " + o2.hashCode());
		System.out.println("p1과 p2 비교 " + (o1.hashCode() == p2.hashCode()));
		System.out.println("o1과 o2의 equals 사용 : " + o1.equals(o2));
		
		person p3 = new person();
		System.out.println(new String("hello").hashCode());
		System.out.println("hello".hashCode());
		p3.name = "홍길동";
		p3.age = 20;
		System.out.println("해시값 비교");
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("p3 getClass() 결과 :" + p3.getClass().toString() );
		System.out.println("p3와 p2값의 equals() 의 결과 : " + p3.equals(p2));
		
		System.out.println(p3.toString());
		
	}

}
