package week04.kje;

public class TV {
	private boolean power;
	private int channel;
	private int volume;
	
	public void showTV() {
		if(power) {
			System.out.println("전원 : "+power);
			System.out.println("채널 : "+channel+" 시청중");
			System.out.println("볼륨 : "+volume);
			System.out.println();
		}
		else {
			System.out.println("전원꺼짐");
		}
		
	}
	
	public void powerOnOff() {
		power = !power;
	}
	
	public void channelUp() {
		if(power)
			++channel;
	}
	
	public  void channelDown() {
		if(power)
			--channel;
	}
	
	public void volumeUp() {
		if(power) {
			if(volume<20)
				++volume;
			else {
				volume = 20;
				System.out.println("최대입니다");
			}
		}
	}
	
	public void volumeDown() {
		if(power) {
			if(volume>0)
				--volume;
			else {
				volume = 0;
				System.out.println("최소입니다");
			}
		}
	}
	
	public void changeChannel(int ch) {
		if(power){
			if(ch>0) {
				channel += ch;
			}
			else {
				channel += ch;
			}
		}
	}
	
	
	public void changeVolume(int vol) {
		if(power){
			if(vol>0) {
				if(volume+vol>20) {
					volume = 20;
				}
				else {
					volume += vol;
				}
			}
			else {
				if(volume+vol<0) {
					volume = 0;
				}
				else {
					volume -= vol;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		TV tv = new TV();
		
		tv.powerOnOff();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.showTV();
		
		tv.changeChannel(3);
		tv.changeVolume(3);
		tv.showTV();
		
		tv.changeChannel(-1);
		tv.changeVolume(-5);
		tv.showTV();
		
		tv.changeVolume(25);
		tv.showTV();
	}

}
