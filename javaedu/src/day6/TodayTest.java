package day6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TodayTest {

	public static void main(String[] args) {
		Date d = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("[Date]");
		System.out.println(d);
		System.out.println(d.toString()); // 객체에 대한 정보를 하나의 문자열로 리턴
		System.out.println(d.getTime());
		

		System.out.println("[GregorianCalendar]");
		System.out.println(gc);
		System.out.println(gc.toString());

		System.out.println("[Calendar]");
		System.out.println(gc.get(Calendar.DAY_OF_YEAR)); // 새해에서 며칠?
		System.out.println(gc.get(Calendar.DAY_OF_MONTH)); // 이번 달에서 며칠 ?
		System.out.println(gc.get(Calendar.DAY_OF_WEEK)); // 이번주에서 며칠?
		System.out.println(gc.get(Calendar.HOUR)); // 12시간 체계로 시간
		System.out.println(gc.get(Calendar.HOUR_OF_DAY)); // 24시간 체계로 시간
	}

}
