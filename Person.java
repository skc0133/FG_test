package MakeClass;

public class Person {
	public int age;
	public int weight;
	public int bp;
	public int tmp;
	public int bs;
	public int pulse;
	
	
	public Person() {
		System.out.println("Person constructor");
	}
	
	public void bd() {
		System.out.println("생일입니다!!!!");
		System.out.println("나이가 들어 이제는 " + ++age + "살 이에요");
	}
	
	public void exercise() {
		System.out.println("운동을하면 체온이 올라가요");
		
	}
	
	public void hm() {
		System.out.println("밥을 먹으면 혈당이 올라가요");
	}

}
