package Week06_example01;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Refreigerator rfg1 = new Refreigerator("건국냉장고", 5);
//		rfg1.menu();
		
//		TV tv1 = new TV("건국티비",3);
//		tv1.menu();
//		
//		Cleaner clean1 = new Cleaner("건국청소기",4);
//		clean1.menu();
		//HomeAppliance ha= new HomeAppliance("건국냉장고"); // 이렇게 생성하는거 abstract 때문에 불가능함
//		
//		Heater heat1 = new Heater("건국히터",8);
//		heat1.menu();
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
		//home1.open();
		//home1.scanIoTDevice();
	}
}
