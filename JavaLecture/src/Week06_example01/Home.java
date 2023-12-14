package Week06_example01;

import java.util.Scanner;

public class Home {
	private HomeAppliance[] apps;
	private final int capacity;
	private int count = 0;
	
	public static Scanner scan = new Scanner(System.in);
	
	public Home(int capacity) {
		super();
		this.capacity = capacity;
		this.apps = new HomeAppliance[this.capacity]; //객체 배열 - 빈방만 생성한 상태
	}
	

	public void buyHA(HomeAppliance ha) { //매개변수의 다형성 사용하는 경우
		if(this.count < this.capacity) {
			apps[count++] = ha;
		}else {
			System.out.println("더이상 공간이 없음.");
		}
	}
	
	public void scanIoTDevice() {
		System.out.println("원격제어 가능 제품!!");
		for(int i = 0;i<count;i++) {
			if(this.apps[i] instanceof IoTInterface)
				System.out.println((i+1)+" : "+ apps[i].getHaName());
		}
	}
	
	public IoTInterface connect() {
		int num = 0;
		System.out.println("원격 제어할 가전제품을 선택하세요!!");
		for(int i = 0;i < count;i++) {
			if(this.apps[i] instanceof IoTInterface) {
				System.out.println((i+1)+" : "+ apps[i].getHaName());
				num++;
			}
		}
		
		if(num == 0) {
			return null;
		}
		
		System.out.print("제품을 선택해 주세요 : ");
		int index = scan.nextInt();
		return (IoTInterface) apps[index-1];
	}
	
	public void open() {
		while(true) {
			System.out.println("제어할 가전제품을 선택하세요!!");
			for(int i = 0;i<count;i++) {
				System.out.println((i+1)+" : "+ apps[i].getHaName());
			}
			System.out.println("0)종료");
			System.out.print("제품을 선택해 주세요 : ");
			int index = scan.nextInt();
			if(index!=0 && index>=1 && index <=count) {
				apps[index-1].menu();
			}else {
				System.out.println("가전제품 제어를 종료합니다.");
				break;
			}
		}
	}
}
