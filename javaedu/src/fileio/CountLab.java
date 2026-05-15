package fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountLab {

	public static void main(String[] args) {
		int result=0;
		
		try(FileReader reader = new FileReader("c:/iotest/yesterday.txt ");
				BufferedReader br = new BufferedReader(reader);){
			String data;
			while(true) {
				data=br.readLine();
				if(data==null)break;
				int originLength = data.length();
				data = data.replace("yesterday", "");
				int changeLength = data.length();
				result+=(originLength-changeLength)/9;
			}
			System.out.println("yesterday 라는 단어는 "+result+"개 있습니다.");
		}catch(Exception e){
			System.out.println("[ERROR]");
		}
	}

}
