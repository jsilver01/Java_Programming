package Week06_example01;

import java.util.Scanner;

public class Heater extends HomeAppliance implements IoTInterface{
	private int temperature = 1;
	
	public static Scanner scan = new Scanner(System.in);

	public Heater(String haName, int temperature) {
		super(haName);
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void showStatus() {
		if(this.isHaPower()) {
			System.out.println(this.getHaName()+", 전원상태 : "+this.isHaPower()+", 온도 : "+this.getTemperature()+"도");
		}else {
			System.out.println("전원이 꺼져 있음.");
		}
		
	}

	@Override
	public void menu() {
		System.out.println("보일러를 제어합니다.");
		System.out.println("1) 전원, 2) 보일러온도");
		System.out.println("원하는 메뉴를 선택하세요 : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 -> {
			this.setHaPower(!this.isHaPower());
			this.showStatus();
		}
		case 2 -> {
			if(this.isHaPower()) {
				System.out.println("보일러 온도 입력 : ");
				this.setTemperature(scan.nextInt());
				System.out.println("보일러 제어 종료!!");
			}else {
				System.out.println("전원이 꺼져 있음.");
			}
		}
		default -> System.out.println("입력메뉴를 확인하세요.");
		}
		
	}

	@Override
	public void turnOn() {
		this.setHaPower(true);
	}

	@Override
	public void turnOff() {
		this.setHaPower(false);
	}

	@Override
	public void control() {
		this.menu();
	}
	
	
}
