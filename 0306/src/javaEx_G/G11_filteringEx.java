package javaEx_G;

import java.util.Arrays;
import java.util.List;

public class G11_filteringEx {
	/*
	 * Stream 3단계 처리순서 객체생성 가공 결과출력
	 * 가공중간처리단계 : 필터링, 매핑, 정렬,그룹핑
	 * 필터링 - Stream 내의 요소를 걸러냄
	 * 메서드 - distinct() 중복 제거, filter() - 조건에 맞는 요소 선택 (boolean 결과(true)에만 
	 * Stream
	 * 	Stream
	 * 	IntStream
	 * 	LongStream
	 * DoubleStream
	 * 
	 */

	public static void main(String[] args) {
		//List 객체 생성
		List<String> list = Arrays.asList("홍길동", "김유신", "홍길동","이순신","홍길동","유관순");
		//distinct() 중복 제거
		System.out.println("distinct()");
		list.stream().distinct().forEach(s->System.out.print(s+" "));
		
		
		//홍 으로 시작하는 문자열로 필터림 후 내부 반복자로 출력
		System.out.println("filter()");
		list.stream().filter(n->n.startsWith("홍"))
		.forEach(s-> System.out.print(s+" "));
		System.out.println();
	
		//distinct 와 filter를 동시에 사용
		System.out.println("disinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("홍"))
		.forEach(s->System.out.println(s+" "));
		System.out.println();
	
		
		
	}

}
