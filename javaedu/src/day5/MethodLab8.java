package day5;

public class MethodLab8 {

	public static void main(String[] args) {
	    if(isRightTriangle(3, 4, 5)) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }
	    if(isRightTriangle(1, 2, 3)) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }

	}

	static boolean isRightTriangle(int width, int height, int hypo) {
		return width*width+height*height==hypo*hypo;
	}
}
