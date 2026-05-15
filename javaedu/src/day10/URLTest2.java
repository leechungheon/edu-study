package day10;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class URLTest2 {
	public static void main(String[] args) {
		try {
			URL req = new URI("https://avatars.githubusercontent.com/u/74524470?v=4").toURL();
			InputStream is = req.openStream();
			FileOutputStream fos = new FileOutputStream("test.jpg");
			int data;
			while(true) {
				data=is.read();
				if(data==-1)
					break;
				fos.write(data);
			}
			System.out.println("파일에 저장완료~~");
			fos.close();
		}catch(Exception e) {
			System.out.println("오류 :"+ e.getMessage());
		}
	}
}
