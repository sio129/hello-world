
public class ExceptionExam2 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		try {
			int k = divide(i,j);	
			System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		
	}
		
	
	public static int divide(int i, int j) throws IllegalArgumentException { //오류를 호출하는 곳에서 처리하라
		if(j==0) {
			throw new IllegalArgumentException("0으로 나눌수 없습니다."); //강제로 exception 발생 시키기
		}
		
	
		int k = i/j;
		return k;
	}
}
