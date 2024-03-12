package quiz;

import java.util.Arrays;

public class ArrayQuiz_ex {

	public static void main(String[] args) {
		//배열 선언 및 초기화
		int[] nums= new int[1000];
		//random 1~100사이값으로 만들어 대입
		for (int i=0; i<1000; i++) {
			nums[i] = (int)(Math.random()*100)+1; //1~100사이의 임의값 i			
		}
		//출력
		System.out.println(Arrays.toString(nums)); 
		System.out.println(nums.length);
	
		int[] cnt = new int[100];      //100개의 카운트 배열 생성
		for(int j = 1; j<=100; j++) {
			for(int i=0; i<nums.length; i++) {	//0~999까지의 인덱스 참조
				if(j==nums[i]) {
					cnt[j-1]++;				
				}
			}	
		}
		//검증 
		int check = 0;
		for(int i=0; i<cnt.length; i++) {
			System.out.println(i+1+"이 나온 횟수 : " + cnt[i]);
			check +=cnt[i];		
		}
		System.out.println(check);
	}	
}
