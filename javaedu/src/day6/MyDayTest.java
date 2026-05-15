package day6;
import java.util.*;

class MyDay{
	static String day;
	static {
		GregorianCalendar birthDate = new GregorianCalendar(2001, 0, 29);
		String[] days = {"", "일", "월", "화", "수", "목", "금", "토"};
		day = days[birthDate.get(Calendar.DAY_OF_WEEK)];
	}
}
public class MyDayTest {

	public static void main(String[] args) {
		System.out.printf("%s 는 %s요일에 태어났어요", "chung_honey", MyDay.day);
	}

}
