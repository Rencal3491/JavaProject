package javaEx_B;

public class B03_swichExample1 {

	public static void main(String[] args) {
		// switch(수식) ~ case 구문
		int jumsu = (int)(Math.random()*100);
		System.out.println("점수 : " + jumsu);
		
		switch(jumsu / 10 ) {
		case 9:
			System.out.println("당신의 학점은 A");
			break;
		case 8:
			System.out.println("당신의 학점은 B");
			break;
		case 7:
			System.out.println("당신의 학점은 C");
			break;
		case 6:
			System.out.println("당신의 학점은 D");
			break;
		default :
			System.out.println("당신의 학점은 F");
			break;
		}
	}

}
