package extraexam;

public class SwitchExample3 {
	public static void main(String[] args) {
		System.out.println(formatter(100));
		System.out.println(formatter("가나다"));
		System.out.println(formatter(3.14));
		System.out.println(formatter(null));
		System.out.println(formatter(true));
		System.out.println(formatter(java.time.LocalDate.now()));
	}
	
	static String formatter(Object obj) {
	    return switch (obj) {
	        case Integer i  -> String.format("Integer %d", i);
	        case String s   -> String.format("String %s", s);
	        case Double d  -> String.format("Double %f", d);
	        case null       -> "It's null!";
	        default         -> obj.toString();
	    };
	}


}
