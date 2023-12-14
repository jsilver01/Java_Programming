package week06.kje;

public class kjeLab01 {

	public static void main(String[] args) {
		System.out.println("202114219 김정은");
		Home home1 = new Home(5);
		
		home1.buyHA(new Refreigerator("건국냉장고",10));
		home1.buyHA(new Refreigerator("대학냉장고",3));
		home1.buyHA(new TV("건국TV",4));
		home1.buyHA(new TV("대학TV",7));
		home1.buyHA(new Cleaner("건국청소기",2));
//		home1.buyHA(new Cleaner("대학청소기",2));
		
		home1.open();

	}

}
