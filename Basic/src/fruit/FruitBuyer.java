package fruit;


public class FruitBuyer {
	int money;
	int fruitCount;
	
	public FruitBuyer(int money, int fruitCount){
		this.money = money;
		this.fruitCount = fruitCount;
	}
	
	public void buyFruit(FruitSeller seller, int cost){
		int count = seller.sellFruit(cost); // 산 과일 개수
		fruitCount += count;
		money -= cost;
	}
	public void showInfo(){
		// 과일 7개를 사고 2000원이 남았습니다.
		System.out.println("과일 " + fruitCount + "개를 사고 " + money + "이 남았습니다.");
	}

}
