package day8;

public class RuntimeTest {
	public static void main(String[] args) throws Exception{
		Runtime obj = Runtime.getRuntime();
		Runtime obj2 = Runtime.getRuntime();
		Runtime obj3 = Runtime.getRuntime();
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//obj.exec("c:/windows/notepad.exe");
	}
}
