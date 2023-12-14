package week06.kje;

public abstract class HomeAppliance { //모든 가전제품의 공통적인 정보 포함
	protected String haName;
	protected boolean haPower = true;
	
	public HomeAppliance(String haName) {
		super();
		this.haName = haName;
	}

	public String getHaName() {
		return haName;
	}

	public boolean isHaPower() {
		return haPower;
	}

	public void setHaName(String haName) {
		this.haName = haName;
	}

	public void setHaPower(boolean haPower) {
		this.haPower = haPower;
	}
	
	public abstract void showStatus(); //클래스마다 다르게 정의할거라서 abstract이고 바디가 없음
	
	public abstract void menu();
}
