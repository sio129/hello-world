
public class MyCalTest {
	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(5, 7);
		System.out.println(i);
		
		System.out.println(Calculator.exec2(3, 6));
		
	}
}
