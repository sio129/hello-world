
public class LedExam {
	public static void main(String[] args) {
		
		TV tv = new LedTV();
		tv.turnOn();
		tv.turnOff();
		tv.changeChannel(8);
		tv.changeVolume(32);
	}
}
