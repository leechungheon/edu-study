package day10;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class URLTest1 {

	public static void main(String[] args) {
		try {
			URL req = new URI("https://www.etnews.com/").toURL();
			InputStream is = req.openStream(); // 바이트 스트림이라 한글이 깨짐
			BufferedReader br = new BufferedReader(new InputStreamReader(is)); // InputStreamReader 문자 스트림으로 읽음
			String data;
			while(true) {
				data=br.readLine(); // 한 줄 씩 읽음
				if(data==null)
					break;
				System.out.println(data);
			}
		}catch(Exception e) {
			System.out.println("오류 :"+ e.getMessage());
		}
	}

}
