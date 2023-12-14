package Week06_example01;

import java.util.Scanner;

public class Cleaner extends HomeAppliance implements IoTInterface{
	private int power = 1;
	
	public static Scanner scan = new Scanner(System.in);

	public Cleaner(String haName, int power) {
		super(haName);
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public void showStatus() {
		if(this.isHaPower()) {
			System.out.println(this.getHaName()+", 전원상태 : "+this.isHaPower()+", 세기 : "+this.getPower()+"단계");
		}else {
			System.out.println("전원이 꺼져 있음.");
		}
	}

	@Override
	public void menu() {
		System.out.println("청소기를 제어합니다.");
		System.out.println("1) 전원, 2)청소 레벨");
		System.out.println("원하는 메뉴를 선택하세요 : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 -> {
			this.setHaPower(!this.isHaPower());
			this.showStatus();
		}
		case 2 -> {
			if(this.isHaPower()) {
				System.out.println("청소 레벨 입력(1~3) : ") ;
				int level = scan.nextInt();
				this.setPower(level);
				System.out.println("청소 강도 "+ level + "로 동작중입니다.");
				System.out.println("청소기 제어 종료!!");
				
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
