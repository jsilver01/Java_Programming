package Week01_example02;

public class CoffeeExample {
	//main 안에 선언되어 지역변수였던것을 전역변수처럼 전환 
	//모든 커피값이 매장마다 동일한 경우 이런식으로 
	final static int Coffee = 100;
	final static int Milk = 50;
	final static int Water = 10;
	
	/*
	 * final int coffee = 100;
	 * final int milk = 50;
	 * final int water = 10;
	 * 매장마다 커피값 다른 경우에 유용 
	 */
	
	public int getCost(int price, int num) { //static을 지우면 오류가 뜨는데 객체를 생성해야지만 사용가능하게 바뀜 그래서 참조형 변수 선언함 
		return price * num;
	}

	public static void main(String[] args) {
		int coffee = 5;
		int milk = 3;
		int water = 1;
		
		//참조형 변수 생성
		CoffeeExample order1 = new CoffeeExample();
				
		int coffeeCost = order1.getCost(Coffee,coffee); 
		int milkCost = order1.getCost(Milk,milk);
		int waterCost = order1.getCost(Water, water);
		
		int totalCost = coffeeCost + milkCost + waterCost;
		
		System.out.println("지불할 총 금액 : " + totalCost);
	}

}
