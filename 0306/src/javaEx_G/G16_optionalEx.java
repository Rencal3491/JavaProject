package javaEx_G;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class G16_optionalEx {
	/*
	 * 집계 메소드
	 * 스트림 api에서 요소들의 최소값, 최댓값, 합계, 평균값 갯수 등을 구할수 있는 메소드 제공
	 * 합계와 갯수를 구하는 메소드 이외에 Optional로 시작하는 타입으로 반환
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[]arr = new int[100];
		for(int i =0; i<100; i++) {
			arr[i]=i+1;
			
		}
		//갯수는 리턴값이 long
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 개수 :" +count);
		
		int sum =  Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : " + sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째의 값 : " + first.getAsInt());
		
		OptionalInt max  = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : " + max.getAsInt());
		OptionalInt min  = Arrays.stream(arr).min();
		System.out.println("요소들 중 최대 값 : " + min.getAsInt());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들 중 평균 값 : " + avg.getAsDouble());
		
		//요소가 없는 빈 Arraylist객체 생성
		List<Integer> list2 = new ArrayList<>();
		long count2 = list2.stream().count();
		System.out.println("요소들의 개수 : " + count2);
		
		int sum2 = list2.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : " + sum2);
		//optionalxxx - isPresent() = 값이 존재하는지 여부 확인
		OptionalDouble avg2 = list2.stream().mapToInt(Integer::intValue).average();
		if(avg2.isPresent()) {
			System.out.println("요소들의 평균 :" + avg2.getAsDouble());
		}
		//orElse()
		int max2 = list2.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 : " + max);
		int min2 = list2.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("요소들 중 최대 값 : " + min2);
		
		
		//요소가 존재하면 실행
		list2.stream().mapToInt(Integer::intValue).findFirst()
		.ifPresent(a->System.out.println("요소의 첫번째 값" + a));
		
		//사용자 집계 메소드 reduce()
		//사용자가 다양한 집계 결과물을 생성할 수 있는 메소드
		//reduce 메소드는 매개변수 타입이 xxxOperator 를 이용하고
		//Stream IntStream LongStream DoubleStream을 전달
		
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);

		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		double areaSum = list.stream().mapToDouble(Shape::area).sum();
		System.out.println("sum을 이용한 면적 합계 : " + areaSum);
		areaSum = list.stream().mapToDouble(Shape::area)
				.reduce((a, b)->a+b).getAsDouble();
		System.out.println("reduce(Operator)를 이용한 면적 합 : " + areaSum);
		
		areaSum = list.stream().mapToDouble(Shape::area)
				.reduce(0, (a,b)->a+b);
		System.out.println("reduce(0, Operator)를 이용한 면적 합 : " + areaSum );
		
	}

}
