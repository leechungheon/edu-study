package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class ImageOLab {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("c:/iotest/list.txt");
				BufferedReader br = new BufferedReader(reader);) {
			String path = "c:/iotest/myimage";
			File isDir = new File(path);
			if (!isDir.exists()) {
				isDir.mkdir();
			}
			for(int i=0; i<10; i++) {
				String[] splitData = br.readLine().split(",");
				FileOutputStream fos = new FileOutputStream("c:/iotest/myimage/"+splitData[0]+".jpg");
				URL req = new URI(splitData[1]).toURL();
				InputStream is = req.openStream();
				int data1;
				while(true) {
					data1=is.read();
					if(data1==-1)
						break;
					fos.write(data1);
				}
				fos.close();
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR]");
		}
	}

}
