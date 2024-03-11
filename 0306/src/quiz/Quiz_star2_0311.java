package quiz;

public class Quiz_star2_0311 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j = 1; j <= 5-i; j ++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		for (int i=5; i>0; i--) {
		    for (int j=5-i; j>0; j--) {
		    	System.out.print(" ");
		    }
		    for (int j=i*2-1; j>0; j--) {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
