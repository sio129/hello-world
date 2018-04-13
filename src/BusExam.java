
public class BusExam {
	public static void main(String[] args) {
		Car c = new Bus(); //부모 타입으로 자식을 가리킬 수 있다. 이 경우 부모가 가지고 있는 내용만 사용 가능
//		c.run();
		
		Bus bus = (Bus)c;
		bus.run();
		bus.ppangppang();
		
	}

	
}
