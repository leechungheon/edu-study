package day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String args[]) {
		FileWriter writer = null; // 출력모드로 오픈
		String path = "c:/iotest";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdir();
		}
		try {
			writer = new FileWriter("c:/iotest/output.txt"); // overwrite
			char arr[] = { '객', '체', '지', '향', '언', '어', ' ',  'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\n");
			writer.write(arr);
			writer.write("\n");
			writer.write("OCJP 시험 대비");
			writer.write("\n");
			writer.write("우리는 한팀!! 마지막까지 서로 도우며 열심히 합시다!!");
			System.out.println("파일에 출력 완료!!");
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (writer != null)
					writer.close(); // close() 메서드 예외처리 해야함
			} catch (Exception e) {
				System.out.println("파일을 닫는동안 오류 발생!!");
			}
		}
	}
}
