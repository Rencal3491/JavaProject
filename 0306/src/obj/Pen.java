package obj;

public class Pen {
	//클래스 안의 코드
	//attribute (속성, 멤버변수) constructors(생성자) method(메소드)
	
	//멤버변수 - attribute
	public String color;		// 패키지 관계없이 불러올 수 있다
	int price; 					// 같은 패키지 내에서만 불러올 수 있다 - default
	public int length;
	
	//메소드 - method 
	public void write() {
		System.out.println("Hello, world~");
	}
	

	// 클래스를 사용하는 이유
	// 대량으로 코드를 반복적으로 사용하기 위해
	// 코드를 최소화하여 작업 할 수 있음
	
	/*
	 *  ## 생성자
	 *  -생성자는 반드시 클래스 내에 한번 이상 선언해야함
	 *  선언하지 않으면 JVM이 대신해서 기본생성자 작성
	 *  기본 생성자는 매개변수를 가지고 있지 않은 형태로, 자동으로 만들어지는 경우에는 내용이 없음
	 *  
	 *  
	 *  ## 생성자 만드는 규칙
	 *  1. 생성자 이름은 클래스 이름과 대소문자까지 정확히 같아야 한다
	 *     클래스 이름과 다른 이름으로 만들면 메소드 취급
	 *  2. 생성자는 메소드와 달리 반환 유형을 가지고 있지 않다
	 *  3. 생성자는 다른 유형으로 여러개 생성이 가능함
	 *  
	 */
	
	//생성자 생성 예시
	public Pen() {   // 기본 생성자 
		color = "black";
		
	}
	
	//멤버 초기화 생성자
	public Pen (String init_color) {
		color = init_color;
		System.out.println("생성자를 이용하여 컬러 초기화");
	}
	public Pen(String init_color, int init_price) {
		color = init_color;
		price = init_price;
		System.out.println("생성자를 이용하여 컬러 가격 초기화");
	}
	public Pen(String color,  int length, int price) {
		this.color=color;
		this.length = length;
		this.price = price;
	}
	// 오버로딩으로 구분되는 생성자 혹은 메소드는 매개변수의 숫자와 타입에 의해서 결정됨
	// 1. 오버로딩을 위해서 이름이 같아야 한다
	// 2. 접근제한자나 반환유형은 오버로딩에 영향을 주지 않음
	// 3. 매개변수의 유형(타입)이 달라야 함
	// 4. 매개변수의 개수가 달라야 함
	// 5. 매개변수의 순서가 달라야 함
	
	public Pen(int length,String color) {
		this.color=color;
		this.length = length;

	}
	public int getPrice() {
		return price;
	}
}

	

