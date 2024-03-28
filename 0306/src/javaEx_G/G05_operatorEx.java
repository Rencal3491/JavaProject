package javaEx_G;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class G05_operatorEx {
	
	static Student[] list = {
			new Student("조민준",90, 80, "컴공"),
			new Student("조민주",95, 70, "통계"),
			new Student("주민준",100, 60, "빅데이터")	
	};
	
	public static void main(String[] args) {
		System.out.println("최대 수학 점수");
		int max = maxOrMinMath((a,b) -> {
			if (a>= b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.println("최소 수학 점수");
		System.out.println(maxOrMinMath((a,b) -> (a<=b?a:b)) );
		
		System.out.println("최소 평균 점수");
		System.out.println(maxOrMinAvg((a,b) -> (a<=b?a:b)));

		System.out.println("최대 평균 점수");
		System.out.println(maxOrMinAvg((a,b) -> (a>=b?a:b)));
		
	}
	private static int maxOrMinMath(IntBinaryOperator op) {
		int res = list[0].getMath();
		for(Student s : list) {
			res = op.applyAsInt(res, s.getMath());
		}
		return res;
		
		
	}
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double res = (list[0].getMath()+list[0].getEng()) /2.0;
		for (Student s :list ) {
			res = op.applyAsDouble(res, (s.getEng()+s.getMath()) /2.0);
		}
		return res;
	}
}
	
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
	public Student(String name , int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
	public String getName() {
		return name;
	}
	
}