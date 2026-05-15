package day10;

public class StandardInputTest {

	public static void main(String[] args) throws Exception{
		System.out.print("입력: ");
		int input = System.in.read(); // read()는 한 문자만 읽음
		System.out.println("입력된 문자: "+(char)input); // 한글 입력 시 오류 -> 1바이트 읽기 때문
		}

}
