package week06.kje;

import java.util.Scanner;

public class Heater extends HomeAppliance {
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
		System.out.println("1) 전원, 2) 온도");
		System.out.print("메뉴를 선택하세요 : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 -> {
			this.setHaPower(!this.isHaPower());
			this.showStatus();
		}
		case 2 -> {
			if(this.isHaPower()) {
				System.out.print("온도 입력 : ");
				this.setTemperature(scan.nextInt());
				this.showStatus();
			}else {
				System.out.println("전원이 꺼져 있음.");
			}
		}
		default -> System.out.println("입력메뉴를 확인하세요.");
		}
		
	}
	
	
}
