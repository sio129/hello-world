
public interface TV {
	public int MIN_VOLUME = 0;  //상수로 선언안해도 상수로 사용할수 있다.
	public int MAX_VOLUME = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
