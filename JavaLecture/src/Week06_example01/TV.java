package Week06_example01;

import java.util.Scanner;

public class TV extends HomeAppliance {
	private int channel = 1;
	
	public static Scanner scan = new Scanner(System.in);
	
	public TV(String haName, int channel) {
		super(haName);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void showStatus() {
		if(this.isHaPower()) {
			System.out.println(this.getHaName()+", 전원상태 : "+this.isHaPower()+", 채널 : "+this.getChannel()+"번");
		}else {
			System.out.println("전원이 꺼져 있음.");
		}
	}

	@Override
	public void menu() {
		System.out.println("티비를 제어합니다.");
		System.out.println("1) 전원, 2) 채널변경");
		System.out.print("메뉴를 선택하세요 : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 -> {
			this.setHaPower(!this.isHaPower());
			this.showStatus();
		}
		case 2 -> {
			if(this.isHaPower()) {
				System.out.print("채널 입력 : ");
				this.setChannel(scan.nextInt());
				this.showStatus();
			}else {
				System.out.println("전원이 꺼져 있음.");
			}
		}
		default -> System.out.println("입력메뉴를 확인하세요.");
		}
	}
	
	
}
