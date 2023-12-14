package week04_example;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 드라이브 100 
		Vehicle car1 = new Vehicle("빨강색",0,10000,'P');
		Vehicle car2 = new Vehicle(car1); // 복사 생성자
		
		car1.showStatus();
		car2.showStatus();
		
		System.out.println("=".repeat(20));
//		car2.color = "보라색";
//		car1.showStatus();
//		car2.showStatus();
		car1.tv.powerOnOff();
		car1.tv.channelUP();
		car1.tv.channelUP();
		car1.tv.channelUP();
		car2.tv.powerOnOff();
		
		car1.showStatus();
		car2.showStatus();
	}

}
