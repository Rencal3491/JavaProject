import java.text.SimpleDateFormat;
import java.util.Date;

public class D12_date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		//특정 문자열 포맷으로 얻고 싶을때 SimpleDateformat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String time = sdf.format(date);
		System.out.println(time);
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("오늘은 E요일 입니다. 오늘은 1년중 D번째 날 입니다");
		System.out.println(sdf.format(date));
	}

}
