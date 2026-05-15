package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyLab {

	public static void main(String[] args){
		try(FileWriter writer = new FileWriter("c:/iotest/sample_new.txt", true);
			FileReader reader = new FileReader("c:/iotest/sample.txt");
				BufferedReader br = new BufferedReader(reader);){
			String data;
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				writer.append(data).append("\n");
			}
			System.out.println("저장 완료되었습니다.");
		}catch(FileNotFoundException e1){
			System.out.println("sample.txt 파일을 찾을 수 없습니다.");
		}catch(IOException e2) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
	}

}
