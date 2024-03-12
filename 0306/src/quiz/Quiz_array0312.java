package quiz;

public class Quiz_array0312 {

	public static void main(String[] args) {
		//numArr 의 총합과 평균을 구해 출력
		int[][] numArr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30}
		};
		int sum = 0; //총합
		int	sums = 0; //전체요소의 개수
		for (int i=0; i<numArr.length; i++) {
			sums += numArr[i].length;
			for(int j=0; j<numArr[i].length; j++) {
				sum+=numArr[i][j];
			}
		}
		System.out.println(sum);
		System.out.println((int)((sum/(double)sums)*100)/100.0);
		
	}

}
