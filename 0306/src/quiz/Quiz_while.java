package quiz;

public class Quiz_while {

	public static void main(String[] args) {
		//while문을 이용하여
		//구구단을 다음과 같이 세로로 출력
		int i = 0;
		while(i<=9) {
			int j=2;
			while(j <=9) {
				if(i== 0) {
					System.out.print(j+"단\t");
				} else {
					System.out.printf("%dx%d=%d\t" , j,i,j*i);
					
				}
				j++;
			}
			System.out.println();
		i++;
		}
		

	}
}


