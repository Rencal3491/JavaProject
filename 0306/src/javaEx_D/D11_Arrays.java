package javaEx_D;
import java.util.Arrays;

public class D11_Arrays {

	public static void main(String[] args) {
		//배열의 복사
		double[] argOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println("원본배열");
		for(double b : argOrg) {
			System.out.print(b + "\t");
		}
		System.out.println();
		//배열의 전체 복사
		double[] argCopy = Arrays.copyOf(argOrg, argOrg.length);
		System.out.println("전체 배열 복사");
		for (double d: argCopy) {
			System.out.print(d+ "\t");
		}
		System.out.println();
		//배열의 일부 복사 -3번째 요소까지
		double[] argCopy2 = Arrays.copyOf(argOrg, 3);
		System.out.println("처음부터 세번째 요소까지 복사");
		for (double d2: argCopy2) {
		System.out.print(d2+ "\t");
		
		//1번인덱스에서 3번 인덱스까지 복사 (특정 범위 내 부분복사)
		double[] argCopy3 = Arrays.copyOfRange(argOrg, 1, 4);
		System.out.println("1번 인덱스부터 3번 인덱스까지 배열 복사");
		for (double d3: argCopy3) {
			System.out.print(d3 + "\t");
		}
		System.out.println();
		}
		int [] scores = {75,47,23,56,89};
		System.out.println(Arrays.toString(scores));
		
		
		//패열의 데이터를 오름차순 정렬 -sort
		int [] scores2 = Arrays.copyOf(scores, scores.length);
		Arrays.sort(scores2);
		System.out.println("오름차순 정렬");
		System.out.println(Arrays.toString(scores2));
		
		//배열 내부 데이터의 인덱스를 탐색하는 메소드 : binarySearch()
		int index = Arrays.binarySearch(scores2, 75);
		System.out.println("75가 있는 인덱스 번호 : "+index);
		
		//배열의 equals() 
		int[] scores3 = Arrays.copyOf(scores, scores.length);
		scores3[2] = 140;
		if(Arrays.equals(scores, scores3)) {
			System.out.println("각 항목이 일치함");
		}else {
			System.out.println("일치하지 않음");
		}
		
	}
		
}
