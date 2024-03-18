import java.awt.Frame;

	class Univ {
		int num;
		static String name;
		//static 내부 클래스 - static이 붙은 멤버와 동일하게 사용가능
		//이 내부클래스는 static이 붙어 있기 때문에 static 붙은 멤버에만 접근가능.
		//접근 방식에 의해서 객체 생성 방법에 차이가 생김
		//static 이 없는 멤버 이너클래스는 외부 객체를 생성한 후에 내부 클래스에 접근가능
		//static 이 있는 경우에는 외부 클래스 객체생성 없이 바로 호출가능
		static class Student {
			
		}
	}
	class Highschool {
		//멤버 이너 클래스
		class Student {
			
		}
	}
	public class D04_staticinner {
	
	public static void main(String[] args) {
		//static이 있는 경우 
		Univ.Student us = new Univ.Student();
		
		// static 이 없는 경우
		//Highschool.Student high = new Highschool.Student(); 안됨		
		Highschool high =  new Highschool();		//외부 객체 
		Highschool.Student hs = high.new Student(); //내부 객체
	}

}
