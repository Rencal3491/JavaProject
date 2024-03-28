package javaEx_G;

import java.util.function.Predicate;

public class G06_predicateEx {
	/*
	 * predicate 함수인터페이스는 매개변수가 있고, 반환값을 boolean으로 처리
	 * 추상 메소드를 test라는 이름으로 가지고 있다
	 * 		인터페이스				추상 메소드
	 * 		Predicate<T>		boolean test<T,t>
	 * 		BiPredicate<T,U>	boolean test<T,U>
	 * 		xxxPredicate		boolean test(xxx)		
	 */
	static Student[] list = {
			new Student("조민준",90, 80, "컴공"),
			new Student("조민주",95, 70, "통계"),
			new Student("주민준",100, 60, "컴공")	
	};
	
	public static void main(String[] args) {
		// 과 가 컴공인 학생의 영어점수 평균
		
		double avgEng = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공 영어평균점수 " + avgEng);
		double avgMath = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공 수학 평균점수 " + avgMath);
	}
	private static double avgEng(Predicate<Student>predicate) {
		int count = 0;
		int sum = 0;
		for(Student st : list) {
			if(predicate.test(st)) {
				count ++;
				sum+=st.getEng();
				
			}
		}
		return (double)sum/count;
	}
	private static double avgMath(Predicate<Student>predicate) {
		int count = 0;
		int sum = 0;
		for(Student st : list) {
			if(predicate.test(st)) {
				count ++;
				sum+=st.getMath();
				
			}
		}
		return (double)sum/count;
	}
}
