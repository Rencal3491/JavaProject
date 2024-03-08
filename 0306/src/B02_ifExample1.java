import java.util.Scanner;

public class B02_ifExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 >> ");
		int num = scan.nextInt();
		
		if(num >= 10) System.out.println("입력한 정수는 10보다 크거나 같음");
		if(num < 10) {
			System.out.println("입력한 정수는 10보다  작음");
			
		}
			System.out.println("프로그램 종료");
		
			scan.close();
	}
}
;
