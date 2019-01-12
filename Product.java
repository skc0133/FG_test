package MakeClass;

public class Product {
	public int price;
	public String pn;
	public int quantity = 10;
	
	
	
	public Product() {
		System.out.println("Product constructor");
	}
	
	public void sell() {
		System.out.println("판매하였습니다");
		System.out.println("남은수량 :" + --quantity);
	}
	
	public void warehousing() {
		System.out.println("입고하였습니다");
		System.out.println("남은수량 :" + ++quantity);
	}
	
	public void booking() {
		System.out.println("상품이 예약 되었습니다.");
	}

}
