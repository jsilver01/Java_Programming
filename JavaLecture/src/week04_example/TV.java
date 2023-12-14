package week04_example;

public class TV {
	private boolean power = true;
	private int channel = 5;
	private int volume =10;
	
	//생성자 3개 생성함 0925
	public TV(boolean power) {
//		this.power = power;
//		//임의의값으로 초기화 가능
//		this.channel =10;
//		this.volume = 5;
		this(power,10,5); //위에 3줄이랑 지금 이거 한줄이랑 똑같은 코드
	}
	
	public TV(boolean power, int channel) {
//		this.power=power;
//		this.channel= channel;
//		this.volume = 7;
		this(power,channel,7);
	}
	
	public TV(boolean power, int channel, int volume) {
		this.power=power;
		this.channel= channel;
		this.volume = volume;
		//this(power,channel,volume);
	}
	
	//이렇게 오버로딩은 불가능 channel 이랑 volume 둘다 int형이라 컴파일러가 구분 불가
//	public TV(boolean power,int volume) {
//		
//	}
	
	public TV() {
		this(false,5,20);
	}

	//복사생성자
	public TV(TV tv) {
		this(tv.power, tv.channel, tv.volume); //위에 TV() 가 false, 5, 20 으로 초기화하기때문에 전원만 켜서 상태 출력해보면 5,20이라고 출력됨
	}

	public void showTV() {
		if(power) {
			System.out.println("전원 : "+power);
			System.out.println("채널 : "+channel+"시청중");
			System.out.println("볼륨 : "+volume);
		}
		else {
			System.out.println("전원꺼짐");
		}
	}

	public void powerOnOff() {
		power = !power;
	}

	public void channelUP() {
		if(power)
			++channel;
	}

	public void channDown() {
		if(power)
			--channel;
	}
	
	public void volumeUP() {
		if(power) {
			if(volume<20)
				++volume;
			else {
				System.out.println("최대입니다");
			}
		}
	}
	
	public void volumeDown() {
		if(power) {
			if(volume>0)
				--volume;
			else {
				System.out.println("최소입니다");
			}
		}
	}
}
