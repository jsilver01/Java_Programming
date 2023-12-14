package Week06_example01;

import java.util.Scanner;

public class Refreigerator extends HomeAppliance {
	private int temperature = 1;
	
	public static Scanner scan = new Scanner(System.in);

	public Refreigerator(String haName, int temperature) { //생성자 이거 보고 메인에서 객체만듦
		super(haName); 
		this.temperature = temperature;
	}

	//위에 temperature 가 private니까 getter setter 사용
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		if(this.isHaPower()) {
			System.out.println(this.getHaName()+", 전원상태 : "+this.isHaPower()+", 냉장온도 : "+this.getTemperature()+"도");
		}else {
			System.out.println("전원이 꺼져 있음.");
		}
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("냉장고를 제어합니다.");
		System.out.println("1) 전원, 2) 냉장온도");
		System.out.print("메뉴를 선택하세요 : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 -> {
			this.setHaPower(!this.isHaPower());
			this.showStatus();
		}
		case 2 -> {
			if(this.isHaPower()) {
				System.out.print("냉장 온도 입력 : ");
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
