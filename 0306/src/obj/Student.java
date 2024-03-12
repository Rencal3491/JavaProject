package obj;

public class Student {
	//멤버 변수, 속성, 필드
	public int kor,eng,pro,his;
	public String name;
	
	//메소드
	public int getTotal() {
		return kor + eng + pro + his;
	}
	public String getName() {
		return name;
	}
	
}
