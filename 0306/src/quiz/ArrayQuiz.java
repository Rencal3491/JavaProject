package quiz;

import java.util.*;

public class ArrayQuiz {

	public static void main(String[] args) {
		// 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 
		//    랜덤 숫자로 채워보세요
		
//		int i,j;
//		int[] nums = new int[1000];
//		Random rand = new Random();
//		for (i = 0; i<nums.length; i++) {
//			nums[i] = rand.nextInt(100);
//		}
//		for (j=0; j<1000; j++) {
//			System.out.println(nums[i]);
//		}
		
		// 2. 1000개의 랜덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요 
	       int randInt=1000; 
	       int[] result=new int[randInt];
	       
	       for(int i=0; i<1001; i++){
	           ++result[(int)(Math.random()*randInt)];
	       }
	       for(int i=0;i<randInt;i++){
	           System.out.println((i+1)+"는 "+result[i]+"번 나왔습니다");
	       }
	 
	}

}