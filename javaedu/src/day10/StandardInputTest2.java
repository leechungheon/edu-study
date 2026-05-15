package day10;

import java.io.InputStreamReader;

public class StandardInputTest2 {

	public static void main(String[] args) throws Exception{
		System.out.print("입력: ");
		int input = new InputStreamReader(System.in).read(); // read()는 한 문자만 읽음
		System.out.println("입력된 문자: "+(char)input);
		}
}
