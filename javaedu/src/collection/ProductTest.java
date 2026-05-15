package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<>();
		String[] productID = {"p100", "p200","p100","p300"};
		String[] productName = {"TV", "Computer","MP3","Audio"};
		int[] productPrice = {20000,10000,700,1000};
		for(int i=0; i<4; i++) {
			if(set.add(new Product(productID[i], productName[i], productPrice[i]))) {
				System.out.println("성공적으로 저장되었습니다.");
			}else {
				System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
			}
		}
		
		List<Product> list = new LinkedList<>();
		for(Product p : set) {
			list.add(p);
		}
		Collections.sort(list);
		
		System.out.println("제품 ID            제품명           가격");
		System.out.println("-----------------------------------------------");
		for(Product p : list) {
			System.out.printf("%s\t\t%s\t\t%d \n", p.getProductID(), p.getProductName(), p.getProductPrice());
		}
	}

}
