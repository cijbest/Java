package fruit;

public class FruitTest {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(10000, 0); //money, fruitCount
		FruitSeller cheapSeller = new FruitSeller(500, 50, 20000); // price, count, money
		FruitSeller expensiveSeller = new FruitSeller(2000, 10, 10000); // price, count, money
		
		buyer.buyFruit(cheapSeller, 2000);
		buyer.showInfo(); // 과일 4개를 사고 8000원이 남았습니다.
		cheapSeller.showInfo(); // 과일 4개를 팔고, 과일은 46개 남고, 돈은 22000원이 되었습니다.
		

		buyer.buyFruit(expensiveSeller, 6000);
		buyer.showInfo(); // 과일 7개를 사고 2000원이 남았습니다.
		expensiveSeller.showInfo(); // 과일 3개를 팔고, 과일은 7개 남고, 돈은 16000원이 되었습니다.
	}

}
