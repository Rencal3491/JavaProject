package javaEx_C;
import obj.Count;

public class C06_static {

	public static void main(String[] args) {
		//Usage Modifiger
		// - Usage Modifiger Access Modifier를 제외한 모든 modifier를 의미함
		// - Usage Modifiger(사용 제한자) 중 static, final, absract
		// - 이외에 transient , synchronized, volatile, native 등이 있음
		
		
		//static의 의미
		//일반적으로 인스턴스들은 서로 독립적으로 객체 내에서 변수값을 서로 각각 다룬다
		//Per p1, Per p2 가 있는 경우 p1.getName(), p2.getName() 는 다른 값
		// static이 변수 앞에 붙으면 모든 인스턴스에 대해서 공유됨 , 이때 변수는 인스턴스 변수가 아닌
		// 클래스 단위로 바뀌고, 이 때문에 static이 붙은 멤버 변수를 클래스 변수라고 함
		// 그리고, static  붙지 않는 변수를 인스턴스 변수라고 하며 구분함
		// 메소드 static이 붙는다면 해당 메소드는 인스턴스와 무관하기 때문에 인스턴스를 생성하지 않아도 호출가능
		
		// static 관련 된 자바 문법
		// > static 메소드 안에서는 non-static 멤버를 객체 생성 없이 직접 참조할 수 없음
		// > 반대로 static 붙지 않은 메소드에서는 static 멤버 지정 가능
		// 모든 인스턴스가 공통된 변수를 가져야 하는 경우 static 변수 사용
		// ststic ㅂ변수와 관련된 작업을 하거나 어떤 인스턴스 변수도 사용하지 않고, 
		// 매개변수로만 처리하는 메소드는 static 메소드로 정의해줌
		//ex) math 클래스의 메소드들
		
		Count c1 =new Count();
		Count c2 =new Count();
		c1.a++;
		c2.b++;
		System.out.println("nonStatic a : " + c1.a);
		System.out.println("Static b : " + c1.b);
		
		Count.b++;
		System.out.println("c1.b : " + c1.b);
		System.out.println("c2.b : " + c2.b);
		System.out.println("Count.b : " + Count.b);
		
		//static method
		System.out.println("Count doit () " + Count.doit());
		System.out.println("Count doit () " + Count.doit());
		System.out.println("Count doit () " + Count.doit());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
