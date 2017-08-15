package fruit;

public class FruitTest {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(10000, 0); //money, fruitCount
		FruitSeller cheapSeller = new FruitSeller(500, 50, 20000); // price, count, money
		FruitSeller expensiveSeller = new FruitSeller(2000, 10, 10000); // price, count, money
		
		buyer.buyFruit(cheapSeller, 2000);
		buyer.showInfo(); // ���� 4���� ��� 8000���� ���ҽ��ϴ�.
		cheapSeller.showInfo(); // ���� 4���� �Ȱ�, ������ 46�� ����, ���� 22000���� �Ǿ����ϴ�.
		

		buyer.buyFruit(expensiveSeller, 6000);
		buyer.showInfo(); // ���� 7���� ��� 2000���� ���ҽ��ϴ�.
		expensiveSeller.showInfo(); // ���� 3���� �Ȱ�, ������ 7�� ����, ���� 16000���� �Ǿ����ϴ�.
	}

}
