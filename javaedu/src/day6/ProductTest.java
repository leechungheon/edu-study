package day6;

class Product{
	String name;
	int balance;
	int price;
	
	Product(){
		name = "듀크인형";
		balance = 5;
		price = 10000;
	}
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	String getName(){
		return name;
	}
	
	int getBalance() {
		return balance;
	}
	
	int getPrice() {
		return price;
	}
}
public class ProductTest {

	public static void main(String[] args) {
		Product[] pArr = new Product[5];
		pArr[0] = new Product("연필", 24, 100);
		pArr[1] = new Product("지우개", 32, 500);
		pArr[2] = new Product("키보드", 5, 50000);
		pArr[3] = new Product("마우스", 12, 20000);
		pArr[4] = new Product("모니터", 3, 250000);
		
		for(int i=0; i<pArr.length; i++) {
			System.out.printf("(%s %d %,d)\n", pArr[i].getName(), pArr[i].getBalance(), pArr[i].getPrice());
		}
	}

}
