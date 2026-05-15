package day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "c:/iolab";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		try(FileWriter writer = new FileWriter("c:/iotest/event.txt");
				PrintWriter out = new PrintWriter(writer);) {
			LocalDate ld1 = LocalDate.of(2026, 8, 15);
			out.printf("%d년 %d월 %d일은 %s입니다.\n", ld1.getYear(), ld1.getMonthValue(), ld1.getDayOfMonth(),ld1.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
			LocalDate ld2 = LocalDate.of(2026, 12, 25);
			out.printf("%d년 %d월 %d일은 %s입니다.\n", ld2.getYear(), ld2.getMonthValue(), ld2.getDayOfMonth(),ld2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
			System.out.println("저장이 완료되었습니다.");
		} catch (IOException e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}

}
