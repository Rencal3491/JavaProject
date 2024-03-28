package javaEx_G;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class G09_streamEx2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("IntStream 생성");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.of() 로 IntStream 만들기");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.range(1,6) IntStream 생성"); //끝값 포함x
		IntStream intstream3 = IntStream.range(1, 6);
		intstream3.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1,5) IntStream 생성"); //끝값 포함o
		IntStream intstream4 = IntStream.rangeClosed(1, 5);
		intstream4.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		//난수 stream 생성
		System.out.print("int형 난수 스트림 : ");
		IntStream isr = new Random().ints(3); 		//ints(3) = 3개의 정수 난수 생성
		isr.forEach(s->System.out.print(s+ " "));
		System.out.println();
		
		isr = new Random().ints(10, 0, 3);
		isr.forEach(s->System.out.print(s+ " "));
		System.out.println();
		
		System.out.print("long 타입 난수 스트림 :");
		LongStream lsr = new Random().longs(3,0,10);
		lsr.forEach(s->System.out.print(s+ " "));
		System.out.println();
		
		System.out.print("double 타입 난수 스트림 :");
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s->System.out.print(s+ " "));
		System.out.println();
		
		//문자열을 스트림으로 처리 chars()메소드
		String str = "java worlds";
		//stream객체 생성
		isr = str.chars();
		isr.forEach(s->System.out.print((char)s));
	}
}
