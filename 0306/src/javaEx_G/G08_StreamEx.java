package javaEx_G;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class G08_StreamEx {

	public static void main(String[] args) {
		
		String[] arr = new String[] {"a","b", "c", "d","e","f"};
		//배열 전체 stream객체로 변환
		Stream<String> stream1 = Arrays.stream(arr);
		//가공 결과
		stream1.forEach(s->System.out.print(s+" "));
		System.out.println();
		//배열의 일부를 추출 Stream 객체 생성
		Stream<String> stream2 = Arrays.stream(arr,2,5);
		stream2.forEach(s->System.out.print(s+" "));
		System.out.println();
		//문자열 배열을 컬렉션 프레임워크로 만들어서 스트림 만들기
		List<String> list = Arrays.asList(arr);
		//List 객체를 stream()을 이용 Stream 객체 생성
		Stream<String>stream3 = list.stream();
		stream3.forEach(s->System.out.print(s+" "));
		System.out.println();
		//스트림 객체 생성	: build() 메소드를 이용하기
		//builder() 메서드로 Builder 객체 생성 이후에 add() 메소드로 리턴타입이
		//Builder 객체이므로 메소드 체이닝 가능
		Stream stream4 = Stream.builder()
				.add("binary는")
				.add("호num sum~")
				.add("num arrays")
				.add("char에~")
				.build();
		stream4.forEach(s->System.out.print(s+" "));
		System.out.println();
				
		// 스트림 객체 생성 : 2. generate() 사용하기
		// 람다에서 Supplier<T> 인터페이스를 이용하여 값을 추가 생성
		Stream<String> stream5 = Stream.generate(()->"num row column char").limit(10);
		stream5.forEach(s->System.out.print(s+" "));
		System.out.println();

		// 스트림 객체 생성 : 3. iterate() 메소드 사용
		Stream<Integer> stream6 = Stream.iterate(1, n -> n+1).limit(10);
		stream6.forEach(s->System.out.print(s+" "));
		System.out.println();
		
	}
	
}
