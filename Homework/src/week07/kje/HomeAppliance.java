package week07.kje;

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
	
	public abstract void showStatus();
	
	public abstract void menu();
}
