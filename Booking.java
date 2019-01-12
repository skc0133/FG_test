package MakeClass;

public class Booking {
	public int time;
	public int np;
	public String name;
	public int phone;
	public String status;
	
	
	
	public Booking() {
		System.out.println("Booking constructor");
	}
	
	public void cancel() {
		System.out.println("예약 취소");
	}
	
	public void books() {
		System.out.println("예약 진행");
	}
	
	public void change() {
		System.out.println("예약 변경");
	}
	
	public void check() {
		System.out.println("예약 조회");
	}


}
