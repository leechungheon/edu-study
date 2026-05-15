package day5;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
//		this.title="자바의 정석";
//		this.author="남궁성";
//		this.price=36000;
		this("자바의 정석", "남궁성", 36000);
	}
	
	Book(String title, String author, int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	String getBookInfo() {
		return this.title+" "+this.author+" "+this.price;
	}
}
public class BookTest {

	public static void main(String[] args) {
		
		Book[] ary = new Book[5];

		ary[0] = new Book();
		ary[1] = new Book("시간관리국1", "캘리앤 브래들리", 19800);
		ary[2] = new Book("시간관리국2", "캘리앤 브래들리", 19800);
		ary[3] = new Book("시간관리국3", "캘리앤 브래들리", 19800);
		ary[4] = new Book("시간관리국4", "캘리앤 브래들리", 19800);
		for(Book b : ary) {
			System.out.println(b.getBookInfo());
		}

}
}
