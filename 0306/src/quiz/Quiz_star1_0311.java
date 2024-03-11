package quiz;

public class Quiz_star1_0311 {

	public static void main(String[] args) {
		//for문을 이용하여 다음과 같이 별 찍기를 진행
		System.out.println("1번");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {			
			System.out.print("*");				
			}
			System.out.println();
			
		}

		System.out.println("2번");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {			
			System.out.print("*");				
			}
			System.out.println();
		}

		System.out.println("3번");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i ; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("4번");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i ; j++) {
				System.out.print(" ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
