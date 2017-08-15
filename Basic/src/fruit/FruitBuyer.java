package fruit;


public class FruitBuyer {
	int money;
	int fruitCount;
	
	public FruitBuyer(int money, int fruitCount){
		this.money = money;
		this.fruitCount = fruitCount;
	}
	
	public void buyFruit(FruitSeller seller, int cost){
		int count = seller.sellFruit(cost); // �� ���� ����
		fruitCount += count;
		money -= cost;
	}
	public void showInfo(){
		// ���� 7���� ��� 2000���� ���ҽ��ϴ�.
		System.out.println("���� " + fruitCount + "���� ��� " + money + "�� ���ҽ��ϴ�.");
	}

}
