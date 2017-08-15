package fruit;

public class FruitSeller {
	
	int price; //1개당 가격
	int count; //남은 과일 개수
	int money; //보유하고 있는 돈
	int sellCount; //판 과일 개수
	
	public FruitSeller(int price, int count, int money){
		this.price = price;
		this.count = count;
		this.money = money;
	}
	
	public int sellFruit(int cost){ //판 개수
		sellCount += cost/price;
		count -= sellCount;
		money += cost;
		return (cost/price);
	}

	public void showInfo(){
		// 과일 3개를 팔고, 과일은 7개 남고, 돈은 16000원이 되었습니다.
		System.out.println("과일 " + sellCount + "개를 팔고, 과일은 " + count + "개 남고, 돈은 " + money + "원이 되었습니다.");
	}
}
