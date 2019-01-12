package MakeClass;

public class Hurricaine {
	public String hn;
	public String number;
	public int latitude;
	public int longitude;
	public int ms;
	public int a;	
	
	public Hurricaine() {
		System.out.println("Hurricaine constructor");
	}
	
	public void dlatitude() {
		System.out.println("위도가"+a+"만큼 감소하였습니다");
		System.out.println("위도 :" + (latitude-a));
	}
	
	public void ilatitude() {
		System.out.println("위도가"+a+"만큼 증가하였습니다");
		System.out.println("위도 :" + (latitude+a));
	}
	
	public void dlongitude() {
		System.out.println("경도가"+a+"만큼 감소하였습니다");
		System.out.println("경도 :" + (longitude-a));
	}
	
	public void ilongitude() {
		System.out.println("경도가"+a+"만큼 증가하였습니다");
		System.out.println("경도 :" + (longitude+a));
	}
}
