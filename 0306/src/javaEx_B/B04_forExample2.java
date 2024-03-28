package javaEx_B;

public class B04_forExample2 {

	public static void main(String[] args) {
		// 다중for문
//		for (int i =0; i<10; i++) {
//			
//			System.out.println("================== 바깥반복문" + i);
//			
//			for(int j=0; j<10; j++) {
//				
//				System.out.println("-----------------안쪽반복문" + i+j);
//				
//				for(int k=0; k<10; k++) {
//					
//					System.out.println("-=-=-=-=-=-=-=-=-=-=- 삼중반복문" +i+j+k);
//				}
//			}
//		}	
//		예제 2) 구구단 출력 2단부터 9단까지
		for (int x= 2; x<10; x++) {
			System.out.println(x+ "단 출력");
			for (int y=1; y<10; y++) {
				System.out.println(x+"x"+y+ "=" + (x*y)+" ");
			}
			System.out.println();
		}
		
	}

}
