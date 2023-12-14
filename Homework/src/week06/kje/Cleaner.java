package week06.kje;

import java.util.Scanner;

public class Cleaner extends HomeAppliance {
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
		System.out.println("1) 전원, 2) 세기");
		System.out.print("메뉴를 선택하세요 : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 -> {
			this.setHaPower(!this.isHaPower());
			this.showStatus();
		}
		case 2 -> {
			if(this.isHaPower()) {
				System.out.print("세기 입력 : ");
				this.setPower(scan.nextInt());
				this.showStatus();
			}else {
				System.out.println("전원이 꺼져 있음.");
			}
		}
		default -> System.out.println("입력메뉴를 확인하세요.");
		}
	}
	
	
}
