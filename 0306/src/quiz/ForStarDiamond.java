package quiz;
import java.util.*;

public class ForStarDiamond {

	public static void main(String[] args) {
		// 다이아몬드 찍기
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요.  
		/*          힌트  : 공백, 별, 단(줄)
		      *
		     ***
		    *****
		   *******
		  *********
		   *******
		    *****
		     ***
		      *
		 */
//		for (int i = 1; i < 6; i++) {
//			for (int j = 5; j > i; j--) {         
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i * 2 - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 4; i > 0; i--) {             
//			for (int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i * 2 - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
			
		// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
		 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)
		System.out.print("라인 수 입력(홀수) : ");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int star = 1;
		int space = line / 2;
		int inSpace = 1;
		int i,j;
		
		for(i = 0; i < line; i++) {	  	//반복횟수 줄 수만큼 설정
			for(j = 0; j < space; j++) 	//여백
				System.out.print(" "); 		
			for(j = 0; j < star; j++) {	//별찍기
				System.out.print("*");
			}
			for(j = 0; j < inSpace; j++)//여백
				System.out.print(" ");
			for(j = 0; j < star; j++) 	//별찍기
				System.out.print("*");
			System.out.println();	
					
			if (i < line / 2) {   	  	//줄의 중간값보다 작으면 별+2 공백-- 				
				space--;
				inSpace+=2;
			}else {	 					//줄의 중간값보다 크면 별-2 공백++				
				space++;
				inSpace-=2;
			}
			
			
		}
		sc.close();
	}
}