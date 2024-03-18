
class InstanceInit {
	public final int DATA;
	//instance initializer
	// - 생성자가 호출되기 전에 호출됨
	// - 인스턴스 변수 초기화에 사용
	// - 생성자를 이용하여 인스턴스 변수 초기화가 가능하기 때문에 사용할 기회는 많이 없음
	{
		DATA =10;
		System.out.println();
	}
}

// static
// - 변수, 메소드, static{}, 클래스에서 사용
// - static 제한자는 지정된 변수와 메소드를 인스턴스와 무관하게 만들어 주기 때문에
// - this를 가질수 없음
//- 변수 : 정적변수, 여러개의 인스턴스가 모두 동일한 장소를 참조
// > final과 같이 사용되어 상수가 됨
//- 메소드 : 객체 생성 없이 참조가능(자주 사용하는 메소드들)
// > ex)Math클래스, static 블럭에는 non-static 멤버를 직접 참조 못함
// > 객체를 생성해서 사용가능

//- 클래스 
//- static{} -static initializer
// > static{} 형태
// > 클래스가 로딩 될 때 생성자 호출 전, 딱 한번만 호출

class StaticInit {
	static {
		System.out.println("static initializer가 수행됨");
	}
	public StaticInit(){
		System.out.println("Constructor가 호출됨");
	}
}






public class C06_static_init {

	public static void main(String[] args) {
		StaticInit s1 = new StaticInit();
		System.out.println(s1);
		StaticInit s2
		= new StaticInit();
		System.out.println(s2);
		
		InstanceInit i1 = new InstanceInit();
		System.out.println(i1.DATA);
		InstanceInit i2 = new InstanceInit();
		System.out.println(i2.DATA);
	}

}
