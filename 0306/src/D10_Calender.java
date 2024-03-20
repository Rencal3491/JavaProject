import java.util.Calendar;
public class D10_Calender {

	//Calender 클래스
	// 날짜 및 시간을 쉽게 받을 수 있는 클래스
	public static void main(String[] args) {
		//Calendar는 생성자를 사용할 수 없고, getInstence() 메소드를 이용해 인스턴스 생성
		//인스턴스 생성 지점의 시간정보 생성
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int hod = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int msec = cal.get(Calendar.MILLISECOND);
		System.out.printf("%d년 %d월 %d일 - %d:%d:%d.%d\n",
				year,month,date,hour,min,sec,msec);
		printDayofSeries(cal);
		cal.set(Calendar.DATE, 5);
		printDayofSeries(cal);
		//원하는 필드 더하기 .add()
		cal.add(Calendar.DATE, 8);
		printDayofSeries(cal);
	}
	static void printDayofSeries(Calendar cal) { 
		//day of year 해당년도 날짜
		int datOfYear = cal.get(Calendar.DAY_OF_YEAR);
		// 달의 날짜
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		//요일 (1일요일~7토요일)
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		System.out.println(Calendar.SUNDAY);
		System.out.println("-------------------------------------");
		int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.printf("dayofYear :  %d\n" + "dayofMonth :  %d\n" + "dayofWeek : %d\n"
						  , datOfYear, dayOfMonth, dayOfWeek);
		
	}
}
