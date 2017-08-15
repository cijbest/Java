package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee kenya = new KenyAmericano();
		kenya.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new KenyAmericano());
		kenyaLatte.brewing();
		System.out.println();
		
		//Kenya Americano Adding milk Adding Mocha syrup
		//Etiopia Americano Adding milk Adding Mocha syrup Adding Whipping Cream
		
		Coffee kenyaMocha = new Mocha(new Latte(new KenyAmericano()));
		kenyaMocha.brewing();
		System.out.println();
		
		Coffee kenyaCream = new Cream(new Mocha(new Latte(new KenyAmericano())));
		kenyaCream.brewing();
		
	

	}

}
