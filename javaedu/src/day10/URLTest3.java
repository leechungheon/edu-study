package day10;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class URLTest3 {

	public static void main(String[] args) {
		try { 
			URL req = new URI("https://www.etnews.com/").toURL();
			InputStream is = req.openStream(); // 바이트 스트림이라 한글이 깨짐
			Scanner sc = new Scanner(is);
			while(sc.hasNext()) { 
				System.out.println(sc.nextLine());
			}
			sc.close();
		}catch(Exception e) {
			System.out.println("오류 :"+ e.getMessage());
		}
	}

}
