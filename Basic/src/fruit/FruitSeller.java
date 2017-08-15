package fruit;

public class FruitSeller {
	
	int price; //1���� ����
	int count; //���� ���� ����
	int money; //�����ϰ� �ִ� ��
	int sellCount; //�� ���� ����
	
	public FruitSeller(int price, int count, int money){
		this.price = price;
		this.count = count;
		this.money = money;
	}
	
	public int sellFruit(int cost){ //�� ����
		sellCount += cost/price;
		count -= sellCount;
		money += cost;
		return (cost/price);
	}

	public void showInfo(){
		// ���� 3���� �Ȱ�, ������ 7�� ����, ���� 16000���� �Ǿ����ϴ�.
		System.out.println("���� " + sellCount + "���� �Ȱ�, ������ " + count + "�� ����, ���� " + money + "���� �Ǿ����ϴ�.");
	}
}
