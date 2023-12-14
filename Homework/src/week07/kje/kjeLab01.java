package week07.kje;

public class kjeLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		
		Home home1 = new Home(10);
		home1.buyHA(new TV("건국TV",15));
		home1.buyHA(new Refreigerator("건국냉장고",0));
		home1.buyHA(new Heater("건국보일러",20));
		home1.buyHA(new Cleaner("건국청소기",1));
		home1.buyHA(new TV("대학TV",10));
		
		IoTInterface iot = home1.connect();
		
		if(iot != null) {
			iot.turnOn();
			iot.control();
			iot.turnOff();
		}else {
			System.out.println("connect 실패!!");
		}

	}

}
